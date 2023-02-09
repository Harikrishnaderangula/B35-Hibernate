package singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();

		//create one emp
		Employee e=new Employee();
		e.setId(1);
		e.setName("Mamatha");
		e.setSalary(30000.78);
		em.persist(e);


		//create 2nd emp
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("Sushmitha");
		e1.setSalary(10000.78);
		em.persist(e1);

		//create one manager
		Manager m=new Manager();
		m.setId(3);
		m.setDeptName("IT");
		m.setName("Sidhdhu");
		m.setSalary(75000);
		em.persist(m);
		em.getTransaction().commit();
		System.out.println("DAta is added in the database");
		em.close();
		factory.close();
	}

}
