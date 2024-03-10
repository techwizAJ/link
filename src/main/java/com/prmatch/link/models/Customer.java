package com.prmatch.link.models;

import com.google.cloud.firestore.annotation.DocumentId;

public class Customer {

  @DocumentId
  private String customerId;

  private String customerName;
  private String address;
  private String city;
  private String state;
  private String email;
  private String phone;

  public Customer() {
  }

  public Customer(String customerId, String customerName, String address, String city, String state, String email,
      String phone) {
    this.customerId = customerId;
    this.customerName = customerName;
    this.address = address;
    this.city = city;
    this.state = state;
    this.email = email;
    this.phone = phone;
  }

  public String getCustomerId() {
    return this.customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "{" +
        " customerId='" + getCustomerId() + "'" +
        ", customerName='" + getCustomerName() + "'" +
        ", address='" + getAddress() + "'" +
        ", city='" + getCity() + "'" +
        ", state='" + getState() + "'" +
        ", email='" + getEmail() + "'" +
        ", phone='" + getPhone() + "'" +
        "}";
  }

}
