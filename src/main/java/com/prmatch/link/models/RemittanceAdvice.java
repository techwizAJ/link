package com.prmatch.link.models;

import java.util.Objects;

public class RemittanceAdvice {

  private String remittanceAdivceId;
  private Payment payment;
  private Remittance remittance;

  public RemittanceAdvice() {
  }

  public RemittanceAdvice(String remittanceAdivceId, Payment payment, Remittance remittance) {
    this.remittanceAdivceId = remittanceAdivceId;
    this.payment = payment;
    this.remittance = remittance;
  }

  public String getRemittanceAdivceId() {
    return this.remittanceAdivceId;
  }

  public void setRemittanceAdivceId(String remittanceAdivceId) {
    this.remittanceAdivceId = remittanceAdivceId;
  }

  public Payment getPayment() {
    return this.payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public Remittance getRemittance() {
    return this.remittance;
  }

  public void setRemittance(Remittance remittance) {
    this.remittance = remittance;
  }

  public RemittanceAdvice remittanceAdivceId(String remittanceAdivceId) {
    setRemittanceAdivceId(remittanceAdivceId);
    return this;
  }

  public RemittanceAdvice payment(Payment payment) {
    setPayment(payment);
    return this;
  }

  public RemittanceAdvice remittance(Remittance remittance) {
    setRemittance(remittance);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof RemittanceAdvice)) {
      return false;
    }
    RemittanceAdvice remittanceAdvice = (RemittanceAdvice) o;
    return Objects.equals(remittanceAdivceId, remittanceAdvice.remittanceAdivceId)
        && Objects.equals(payment, remittanceAdvice.payment) && Objects.equals(remittance, remittanceAdvice.remittance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remittanceAdivceId, payment, remittance);
  }

  @Override
  public String toString() {
    return "{" +
        " remittanceAdivceId='" + getRemittanceAdivceId() + "'" +
        ", payment='" + getPayment() + "'" +
        ", remittance='" + getRemittance() + "'" +
        "}";
  }

}
