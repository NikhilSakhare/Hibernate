package com.bikkadit.hbr.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;

public class App 
{
    public static void main( String[] args ) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
//      session factory creates session
//      we used session for transaction
   	
   	Configuration cfg = new Configuration();
   	cfg.configure("hibernate.cfg.xml");
   	SessionFactory factory = cfg.buildSessionFactory();
   	
   	Session session = factory.openSession();
   	
   	Country ctr = new Country();
   	ctr.setId(11);
   	ctr.setName("India");
   	ctr.setLang("Hindi");
   	ctr.setPm("Modi");
   	ctr.setStateCount(29);
   	
   	Transaction tx = (Transaction) session.beginTransaction();
   	
   	session.save(ctr);
   	tx.commit();
   	session.close();
   	factory.close();
   	
   	
   	
    }
}
