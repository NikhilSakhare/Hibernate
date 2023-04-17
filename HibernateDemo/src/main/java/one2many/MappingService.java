package one2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class MappingService {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

		Country ctr = new Country();
		ctr.setId(11);
		ctr.setName("India");
		ctr.setPm("Modi");

		City c1 = new City();

		c1.setCid(21);
		c1.setCname("Bhilai");
		c1.setCountry(ctr);

		City c2 = new City();
		c2.setCid(22);
		c2.setCname("Nagpur");
		c2.setCountry(ctr);

		List<City> city_list = new ArrayList();
		city_list.add(c1);
		city_list.add(c2);

		ctr.setCity(city_list);

		Session session = factory.openSession();

		Transaction tx = (Transaction) session.beginTransaction();

		session.save(ctr);
		/*
		 * session.save(c2); session.save(c1);
		 */

		tx.commit();

		// Country country=session.get(Country.class,111);
//		City city = session.get(City.class,21);
		session.close();
		factory.close();

	}
}