package com.prmatch.link.models;

import java.util.Objects;

public class Remittance {

  private String remittanceHeaderId;
  private String customerName;
  private String invoiceNumber;
  private double paymentAmount;
  private String lockBoxNumber;

  public Remittance() {
  }

  public Remittance(String remittanceHeaderId, String customerName, String invoiceNumber, double paymentAmount,
      String lockBoxNumber) {
    this.remittanceHeaderId = remittanceHeaderId;
    this.customerName = customerName;
    this.invoiceNumber = invoiceNumber;
    this.paymentAmount = paymentAmount;
    this.lockBoxNumber = lockBoxNumber;
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

  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public String getLockBoxNumber() {
    return this.lockBoxNumber;
  }

  public void setLockBoxNumber(String lockBoxNumber) {
    this.lockBoxNumber = lockBoxNumber;
  }

  public Remittance remittanceHeaderId(String remittanceHeaderId) {
    setRemittanceHeaderId(remittanceHeaderId);
    return this;
  }

  public Remittance customerName(String customerName) {
    setCustomerName(customerName);
    return this;
  }

  public Remittance invoiceNumber(String invoiceNumber) {
    setInvoiceNumber(invoiceNumber);
    return this;
  }

  public Remittance paymentAmount(double paymentAmount) {
    setPaymentAmount(paymentAmount);
    return this;
  }

  public Remittance lockBoxNumber(String lockBoxNumber) {
    setLockBoxNumber(lockBoxNumber);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Remittance)) {
      return false;
    }
    Remittance remittance = (Remittance) o;
    return Objects.equals(remittanceHeaderId, remittance.remittanceHeaderId)
        && Objects.equals(customerName, remittance.customerName)
        && Objects.equals(invoiceNumber, remittance.invoiceNumber) && paymentAmount == remittance.paymentAmount
        && Objects.equals(lockBoxNumber, remittance.lockBoxNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remittanceHeaderId, customerName, invoiceNumber, paymentAmount, lockBoxNumber);
  }

  @Override
  public String toString() {
    return "{" +
        " remittanceHeaderId='" + getRemittanceHeaderId() + "'" +
        ", customerName='" + getCustomerName() + "'" +
        ", invoiceNumber='" + getInvoiceNumber() + "'" +
        ", paymentAmount='" + getPaymentAmount() + "'" +
        ", lockBoxNumber='" + getLockBoxNumber() + "'" +
        "}";
  }

}
