package com.prmatch.link.dao;

import com.google.cloud.firestore.Firestore;
import com.prmatch.link.models.Customer;
import com.prmatch.link.models.Payment;

public class CustomerRepo extends AbstractFirestoreRepository<Customer> {

  protected CustomerRepo(Firestore firestore, String collection) {
    super(firestore, collection);
  }

}
