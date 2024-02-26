package com.rays.inheritance.tebleperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTeblePerClass {
	public static void main(String[] args) {
		
		
		Cheque cq = new Cheque();
		cq.setId(2);
		cq.setAmount(2000);
		cq.setPaymentType("cheque");
		cq.setChqNumber("bob12345");
		cq.setBankName("bob");
		
		CreditCardPayment ccp =  new CreditCardPayment();
		ccp.setId(3);
		ccp.setAmount(3000);
		ccp.setCcType("visa");
		ccp.setPaymentType("imps");
		
		Cash cash = new Cash();
		cash.setId(4);
		cash.setAmount(4000);
		cash.setPaymentType("cash");
		
		SessionFactory sf = new  Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		session.save(cq);
		session.save(ccp);
		session.save(cash);
		
		tx.commit();
		session.close();
		
		
		
		
		
	}

}
