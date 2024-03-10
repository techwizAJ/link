package com.prmatch.link.dao;

import com.google.cloud.firestore.Firestore;
import com.prmatch.link.models.Remittance;

public class RemitRepo extends AbstractFirestoreRepository<Remittance> {

  protected RemitRepo(Firestore firestore, String collection) {
    super(firestore, collection);
    // TODO Auto-generated constructor stub
  }

}
