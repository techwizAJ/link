package com.prmatch.link.dao;

import com.google.cloud.firestore.Firestore;
import com.prmatch.link.models.Invoice;

public class InvoiceRepo extends AbstractFirestoreRepository<Invoice> {

  protected InvoiceRepo(Firestore firestore, String collection) {
    super(firestore, collection);
    // TODO Auto-generated constructor stub
  }

}
