package com.prmatch.link.models;

import java.util.List;

import com.google.cloud.firestore.annotation.DocumentId;

public class Remittance {

  @DocumentId
  private String remittanceId;

  private Integer remittanceHeaderId;
  private String customerName;
  private List<String> invoiceNumberList;
  private double paymentAmount;
  private String paymentId;

  public Remittance() {
  }

  public Remittance(String remittanceId, Integer remittanceHeaderId, String customerName,
      List<String> invoiceNumberList, double paymentAmount, String paymentId) {
    this.remittanceId = remittanceId;
    this.remittanceHeaderId = remittanceHeaderId;
    this.customerName = customerName;
    this.invoiceNumberList = invoiceNumberList;
    this.paymentAmount = paymentAmount;
    this.paymentId = paymentId;
  }

  public String getRemittanceId() {
    return this.remittanceId;
  }

  public void setRemittanceId(String remittanceId) {
    this.remittanceId = remittanceId;
  }

  public Integer getRemittanceHeaderId() {
    return this.remittanceHeaderId;
  }

  public void setRemittanceHeaderId(Integer remittanceHeaderId) {
    this.remittanceHeaderId = remittanceHeaderId;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public List<String> getInvoiceNumberList() {
    return this.invoiceNumberList;
  }

  public void setInvoiceNumberList(List<String> invoiceNumberList) {
    this.invoiceNumberList = invoiceNumberList;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public String getPaymentId() {
    return this.paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

}
