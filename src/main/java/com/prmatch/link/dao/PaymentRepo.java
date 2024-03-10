package com.prmatch.link.dao;

import com.google.cloud.firestore.Firestore;
import com.prmatch.link.models.Payment;

public class PaymentRepo extends AbstractFirestoreRepository<Payment> {

  protected PaymentRepo(Firestore firestore, String collection) {
    super(firestore, collection);
  }

}
