package com.prmatch.link.commonutil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Component;

import com.prmatch.link.models.Remittance;

//Parse Remittance File into list of remittance files
@Component
public class PdfRemittanceParser {

  Logger logger = LogManager.getLogger(PdfRemittanceParser.class);

  private void parseRemittanceFile(File file) {
    PDDocument document = null;
    try {
      document = Loader.loadPDF(file);

      PDFTextStripper pdfStripper = new PDFTextStripper();
      String text = pdfStripper.getText(document);

      String hdrRegex = "Payer:\\s+([^\\n]+)\\s+Payment\\s+Amount:\\s+\\W([^\\s]+)\\s+Payment\\sID:\\s+([^\\n]+)\\s+Vendor\\sID:\\s+([^\\s]+)\\s+Vendor\\sName:\\s([^\\n]+)";
      String itemRegex = "(\\d{6,11})\\s+(\\d{1,2}\\W\\d{1,2}\\W\\d{4})\\s+([^\\s]+)";

      Matcher matcher = getMatcher(text, itemRegex);
      Remittance remit = new Remittance();
      List<String> invoices = new ArrayList<>();

      while (matcher.find()) {
        invoices.add(matcher.group(1));
      }
      remit.setInvoiceNumber(invoices);
      matcher = getMatcher(text, hdrRegex);
      while (matcher.find()) {
        remit.setCustomerName(matcher.group(4));
        remit.setPaymentAmount(Double.parseDouble(matcher.group(2)));
        remit.setpaymentId(matcher.group(3));
      }

    } catch (Exception e) {
      logger.error("Exception IN PDF parsing", e);
    } finally {
      if (document != null) {
        try {
          document.close();
        } catch (IOException e) {
          logger.error("Exception IN IO", e);
        }
      }
    }

    // Peristance Logic to be added

  }

  private Matcher getMatcher(String document, String regex) {
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(document);
    return matcher;
  }

}