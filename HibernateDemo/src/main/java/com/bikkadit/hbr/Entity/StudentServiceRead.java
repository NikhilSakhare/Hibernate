package com.bikkadit.hbr.Entity;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class StudentServiceRead {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		org.hibernate.SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		/*
		 * Student st=session.get(Student.class, 2); System.out.println(st.getName());
		 */
		
		/*
		 * Student st = session.load(Student.class,3); System.out.println(st.getName());
		 */
		
		Student st= session.getReference(Student.class ,3);
		System.out.println(st.getName());
		session.close();
		factory.close();
	}

}
