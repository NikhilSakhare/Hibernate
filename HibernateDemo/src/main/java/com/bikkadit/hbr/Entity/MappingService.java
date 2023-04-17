package com.bikkadit.hbr.Entity;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingService {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory =cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Capital ctr = new Capital();
		ctr.setId(1);
		ctr.setName("India");
		ctr.setPm("Modi");
		
		Capital ct = new Capital();
		
				
	}

}
