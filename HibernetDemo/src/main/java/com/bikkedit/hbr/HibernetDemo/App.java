package com.bikkedit.hbr.HibernetDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    //session factory creates session    
    //we used session for transaction
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	Country ctr = new Country();
    	ctr.setId(101);
    	ctr.setName("India");
    	ctr.setLang("Hindi");
    	ctr.setPm("N.D.Modi");
    	ctr.setStateCount(29);
    	
    	Session session = factory.openSession();
    	session.save(ctr);
    	
    	session.close();
    	factory.close();
    	
    	
    	
    }
}
