package one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		/*
		 * Country ctr = new Country(); ctr.setId(01); ctr.setName("India");
		 * ctr.setPm("Modi");
		 * 
		 * Capital ct = new Capital(); ct.setCid(111); ct.setCname("Mumbai");
		 * ctr.setCapital(ct); ct.setCountry(ctr);
		 */
		
		Session session = factory.openSession();
		/*
		 * Transaction tx = session.beginTransaction(); session.save(ctr);
		 */
		
		
		Country country=session.get(Country.class,1);
		System.out.println(country.getName());
		System.out.println("Main entity fetched");
		System.out.println(country.getCapital().getCname());
		/*
		 * session.save(ct); tx.commit();
		 */
		session.close();
		factory.close();
		
	}

}
