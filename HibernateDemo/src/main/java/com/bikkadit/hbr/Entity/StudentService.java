package com.bikkadit.hbr.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class StudentService {
	
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		
		SessionFactory factory= cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session= factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		Student st =new Student();
		
		st.setId(01);
		st.setName("Nikhil");
		st.setDept("CS");
		st.setAge(26);
		st.setCity("Gondia");
		st.setEca("Codding");
		st.setMark(80.5);
		
		st.setId(02);
		st.setName("Saurabh");
		st.setDept("Eng");
		st.setAge(28);
		st.setCity("Pune");
		st.setEca("ENginear");
		st.setMark(100);
		
		session.save(st);
		//session.persist(st);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
