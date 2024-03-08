package com.prmatch.link.models;

import java.util.Date;
import java.util.Objects;

public class Invoice {

  private String invoiceId;
  private String invoiceNumber;
  private Date invoiceDate;
  private boolean isOpen;
  private String customerName;
  private Date dueDate;
  private String toleranceDays;
  private double toleranceAmount;
  private double paymentAmount;
  private double discountAmount;

  public Invoice() {
  }

  public Invoice(String invoiceId, String invoiceNumber, Date invoiceDate, boolean isOpen, String customerName,
      Date dueDate, String toleranceDays, double toleranceAmount, double paymentAmount, double discountAmount) {
    this.invoiceId = invoiceId;
    this.invoiceNumber = invoiceNumber;
    this.invoiceDate = invoiceDate;
    this.isOpen = isOpen;
    this.customerName = customerName;
    this.dueDate = dueDate;
    this.toleranceDays = toleranceDays;
    this.toleranceAmount = toleranceAmount;
    this.paymentAmount = paymentAmount;
    this.discountAmount = discountAmount;
  }

  public String getInvoiceId() {
    return this.invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public String getInvoiceNumber() {
    return this.invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Date getInvoiceDate() {
    return this.invoiceDate;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public boolean isIsOpen() {
    return this.isOpen;
  }

  public boolean getIsOpen() {
    return this.isOpen;
  }

  public void setIsOpen(boolean isOpen) {
    this.isOpen = isOpen;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Date getDueDate() {
    return this.dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public String getToleranceDays() {
    return this.toleranceDays;
  }

  public void setToleranceDays(String toleranceDays) {
    this.toleranceDays = toleranceDays;
  }

  public double getToleranceAmount() {
    return this.toleranceAmount;
  }

  public void setToleranceAmount(double toleranceAmount) {
    this.toleranceAmount = toleranceAmount;
  }

  public double getPaymentAmount() {
    return this.paymentAmount;
  }

  public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public double getDiscountAmount() {
    return this.discountAmount;
  }

  public void setDiscountAmount(double discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Invoice invoiceId(String invoiceId) {
    setInvoiceId(invoiceId);
    return this;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
    setInvoiceNumber(invoiceNumber);
    return this;
  }

  public Invoice invoiceDate(Date invoiceDate) {
    setInvoiceDate(invoiceDate);
    return this;
  }

  public Invoice isOpen(boolean isOpen) {
    setIsOpen(isOpen);
    return this;
  }

  public Invoice customerName(String customerName) {
    setCustomerName(customerName);
    return this;
  }

  public Invoice dueDate(Date dueDate) {
    setDueDate(dueDate);
    return this;
  }

  public Invoice toleranceDays(String toleranceDays) {
    setToleranceDays(toleranceDays);
    return this;
  }

  public Invoice toleranceAmount(double toleranceAmount) {
    setToleranceAmount(toleranceAmount);
    return this;
  }

  public Invoice paymentAmount(double paymentAmount) {
    setPaymentAmount(paymentAmount);
    return this;
  }

  public Invoice discountAmount(double discountAmount) {
    setDiscountAmount(discountAmount);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Invoice)) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(invoiceId, invoice.invoiceId) && Objects.equals(invoiceNumber, invoice.invoiceNumber)
        && Objects.equals(invoiceDate, invoice.invoiceDate) && isOpen == invoice.isOpen
        && Objects.equals(customerName, invoice.customerName) && Objects.equals(dueDate, invoice.dueDate)
        && Objects.equals(toleranceDays, invoice.toleranceDays) && toleranceAmount == invoice.toleranceAmount
        && paymentAmount == invoice.paymentAmount && discountAmount == invoice.discountAmount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, invoiceNumber, invoiceDate, isOpen, customerName, dueDate, toleranceDays,
        toleranceAmount, paymentAmount, discountAmount);
  }

  @Override
  public String toString() {
    return "{" +
        " invoiceId='" + getInvoiceId() + "'" +
        ", invoiceNumber='" + getInvoiceNumber() + "'" +
        ", invoiceDate='" + getInvoiceDate() + "'" +
        ", isOpen='" + isIsOpen() + "'" +
        ", customerName='" + getCustomerName() + "'" +
        ", dueDate='" + getDueDate() + "'" +
        ", toleranceDays='" + getToleranceDays() + "'" +
        ", toleranceAmount='" + getToleranceAmount() + "'" +
        ", paymentAmount='" + getPaymentAmount() + "'" +
        ", discountAmount='" + getDiscountAmount() + "'" +
        "}";
  }

}
