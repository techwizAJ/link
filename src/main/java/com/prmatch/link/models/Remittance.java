package com.prmatch.link.models;

import java.util.List;

public class Remittance {

  private String remittanceHeaderId;
  private String customerName;
  private List<String> invoiceNumberList;
  private double paymentAmount;
  private String paymentId;

  public Remittance() {
  }

  public Remittance(String remittanceHeaderId, String customerName, List<String> invoiceNumberList,
      double paymentAmount,
      String paymentId) {
    this.remittanceHeaderId = remittanceHeaderId;
    this.customerName = customerName;
    this.invoiceNumberList = invoiceNumberList;
    this.paymentAmount = paymentAmount;
    this.paymentId = paymentId;
  }

  public String getRemittanceHeaderId() {
    return this.remittanceHeaderId;
  }

  public void setRemittanceHeaderId(String remittanceHeaderId) {
    this.remittanceHeaderId = remittanceHeaderId;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public List<String> getInvoiceNumber() {
    return this.invoiceNumberList;
  }

  public void setInvoiceNumber(List<String> invoiceNumberList) {
    this.invoiceNumberList = invoiceNumberList;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public String getpaymentId() {
    return this.paymentId;
  }

  public void setpaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  @Override
  public String toString() {
    return "{" +
        " remittanceHeaderId='" + getRemittanceHeaderId() + "'" +
        ", customerName='" + getCustomerName() + "'" +
        ", invoiceNumber='" + getInvoiceNumber() + "'" +
        ", paymentAmount='" + getPaymentAmount() + "'" +
        ", paymentId='" + getpaymentId() + "'" +
        "}";
  }

}
