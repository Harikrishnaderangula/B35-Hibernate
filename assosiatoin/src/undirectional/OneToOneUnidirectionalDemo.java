package undirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//added one student
		Student s=new Student();
		s.setRollno(101);
		s.setName("Ramana");
		
		Address a=new Address();
		a.setPincode(440015);
		a.setCity("load");
		a.setState("Ettalira");
		
		s.setAddress(a);
		em.persist(s);
		System.out.println("Data is added");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
