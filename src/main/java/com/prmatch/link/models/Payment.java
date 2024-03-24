package com.prmatch.link.models;

import java.util.Date;
import java.util.Objects;

import com.google.cloud.firestore.annotation.DocumentId;

public class Payment {

  @DocumentId
  private String documentId;

  private Integer paymentHdrId;
  private double paymentAmount;
  private Date paymentDate;
  private String paymentType;
  private String customerName;

  public Payment() {
  }

  public Payment(String documentId, Integer paymentHdrId, double paymentAmount, Date paymentDate, String paymentType,
      String customerName) {
    this.documentId = documentId;
    this.paymentHdrId = paymentHdrId;
    this.paymentAmount = paymentAmount;
    this.paymentDate = paymentDate;
    this.paymentType = paymentType;
    this.customerName = customerName;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Integer getPaymentHdrId() {
    return this.paymentHdrId;
  }

  public void setPaymentHdrId(Integer paymentHdrId) {
    this.paymentHdrId = paymentHdrId;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public Date getPaymentDate() {
    return this.paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getPaymentType() {
    return this.paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

}
