package embedable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

public class EmbedService {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		 Employee emp = new Employee();
		 emp.setId(1);
		 emp.setName("Saurabh");
		 emp.setDept("HR");
		 
		 Department dp = new Department();
		 dp.setDepId(1111);
		 dp.setDeptName("Human Resource");
		 emp.setDepartment(dp);
		 
		 HOD h= new HOD();
		 h.setHodID(201);
		 h.setHodName("Ganesh");
		 emp.setHod(h);
		 
		 Session session = factory.openSession();
		 org.hibernate.Transaction tx= session.beginTransaction();
		 session.save(emp);
		 tx.commit();
		 session.close();
		 factory.close();
		 
	}
}
