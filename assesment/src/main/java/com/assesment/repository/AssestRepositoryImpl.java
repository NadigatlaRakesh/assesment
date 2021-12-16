package com.assesment.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.assesment.config.SessionConfig;

@Repository
public class AssestRepositoryImpl {

public void fetchNumber() {
	SessionFactory getsf = SessionConfig.getsf();
	Session session = getsf.openSession();
	Transaction tr = session.beginTransaction();
	session.createQuery("from ");
	}
}
