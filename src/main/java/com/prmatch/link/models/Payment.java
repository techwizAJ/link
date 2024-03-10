package com.prmatch.link.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Payment {

  private String paymentHdrId;
  private List<Double> paymentAmount;
  private Date paymentDate;
  private String paymentType;
  private String customerName;
  private String senderAccountNumber;

  public Payment() {
    paymentAmount = new ArrayList<>();
  }

  public Payment(String paymentHdrId, List<Double> paymentAmount, Date paymentDate, String paymentType, String customerName) {
    this.paymentHdrId = paymentHdrId;
    this.paymentAmount = new ArrayList<>(paymentAmount);
    this.paymentDate = paymentDate;
    this.paymentType = paymentType;
    this.customerName = customerName;
  }

  public String getPaymentHdrId() {
    return this.paymentHdrId;
  }

  public void setPaymentHdrId(String paymentHdrId) {
    this.paymentHdrId = paymentHdrId;
  }

  public List<Double> getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(List<Double> paymentAmount) {
    this.paymentAmount.addAll((List<Double>)paymentAmount);
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
  public void setSenderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
  }
  public String getSenderAccountNumber(){
    return senderAccountNumber;
  }
  public Payment paymentHdrId(String paymentHdrId) {
    setPaymentHdrId(paymentHdrId);
    return this;
  }

  public Payment paymentAmount(List<Double> paymentAmount) {
    setPaymentAmount(paymentAmount);
    return this;
  }

  public Payment paymentDate(Date paymentDate) {
    setPaymentDate(paymentDate);
    return this;
  }

  public Payment paymentType(String paymentType) {
    setPaymentType(paymentType);
    return this;
  }

  public Payment customerName(String customerName) {
    setCustomerName(customerName);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Payment)) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(paymentHdrId, payment.paymentHdrId) && paymentAmount == payment.paymentAmount
        && Objects.equals(paymentDate, payment.paymentDate) && Objects.equals(paymentType, payment.paymentType)
        && Objects.equals(customerName, payment.customerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentHdrId, paymentAmount, paymentDate, paymentType, customerName);
  }

  @Override
  public String toString() {
    return "{" +
        " paymentHdrId='" + getPaymentHdrId() + "'" +
        ", paymentAmount='" + getPaymentAmount() + "'" +
        ", paymentDate='" + getPaymentDate() + "'" +
        ", paymentType='" + getPaymentType() + "'" +
        ", customerName='" + getCustomerName() + "'" +
        ", List<Payments>='" + getPaymentAmount().toString()+"'"+
        ", senderAccountNumber='" + getSenderAccountNumber() + "'"+
        "}";
  }

}
