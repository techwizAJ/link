package com.prmatch.link.commonutil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.prmatch.link.models.Payment;

// Parse BAI2 files into List of Payment Objects
@Component
public class Bai2PaymentParser {

    List<Payment> payments;
    Logger logger = LogManager.getLogger(PdfRemittanceParser.class);

    private String readFile(File file){
        String content = "";
        String filename = "samplebai2file.bai2";

        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filename));
            content = new String(bytes);
        } catch (IOException e) {
            logger.error("Exception occured while reading bai2 file");
        }

        return content;
    }

    private List<Payment> parseBai2(String content){

        String[] bisDocs = content.split("/");
        Payment payment = new Payment();

        for (String line : bisDocs) {
            String[] rowString = line.split(",");

            int startingIndex = Integer.parseInt(rowString[0].trim());
            System.out.println("starting index = " + startingIndex);

            switch (startingIndex) {

                case 1:
                    this.getDate(rowString, payment);
                    break;

                case 3:
                    this.getPayments(rowString, payment);
                    break;

                case 49:
                case 88:
                    System.out.println(payment);
                    payments.add(payment);
                    payment = new Payment();
                    break;
            }
        }
        return payments;
    }

    private void getDate(String[] s, Payment payment) {
        System.out.println("Inside getDate");
        // LocalDate date = LocalDate.parse(s[3], DateTimeFormatter.BASIC_ISO_DATE);
        // payment.setPaymentDate(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));;
    }

    private void getPayments(String[] s, Payment payment){

        List<Double> amounts = new ArrayList<>();
        
        if(s[0].trim().equals("03")){
            payment.setSenderAccountNumber(s[1].trim());
            for(int i = 4; i< s.length; i = i+4){

                if(Character.isDigit(s[i].trim().charAt(0))){
                    amounts.add(Double.parseDouble(s[i].trim())/100);}
                else
                    amounts.add(Double.parseDouble(s[i].trim().substring(1))/100);
            }
        }
        else {
            // for(int i = 4; i< s.length; i = i+4)
            // if(Character.isDigit(s[0].charAt(0))
            //     amounts.add(Double.parseDouble(s[i].trim()));
        }
    
        payment.setPaymentAmount(amounts);
        System.out.println("Payment = " + payment);
    }

}
