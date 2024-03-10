package com.prmatch.link.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prmatch.link.commonutil.Bai2PaymentParser;
import com.prmatch.link.commonutil.FileUploadUtil;
import com.prmatch.link.commonutil.PdfRemittanceParser;

// Logic To Upload files to system & call proper parsers --> D 
@RestController
@RequestMapping("/files/upload")
public class FileUploads {

  @Autowired
  private Bai2PaymentParser paymentParser;

  @Autowired
  private PdfRemittanceParser remittanceParser;

  @PostMapping("/Payment")
  public ResponseEntity<?> handlePaymentFileUploadUsingCurl(
      @RequestParam("file") MultipartFile multipartFile) throws IOException {

    // Download file in server
    String fileName = multipartFile.getOriginalFilename();
    long size = multipartFile.getSize();

    String filecode = FileUploadUtil.saveFile(fileName, multipartFile);

    // Call payments parse -- parse payment file method here

    return new ResponseEntity<>(HttpStatusCode.valueOf(200));
  }

  @PostMapping("/Remittance")
  public ResponseEntity<?> handleRemitFileUpload(
      @RequestParam("file") MultipartFile multipartFile) throws IOException {

    // Download file in server
    String fileName = multipartFile.getOriginalFilename();
    long size = multipartFile.getSize();

    String filecode = FileUploadUtil.saveFile(fileName, multipartFile);

    // Call remittance parse method-- parse payment file method here

    return new ResponseEntity<>(HttpStatusCode.valueOf(200));
  }

}
