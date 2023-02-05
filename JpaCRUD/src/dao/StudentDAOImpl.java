package dao;

import javax.persistence.EntityManager;

import entities.Student;

public class StudentDAOImpl implements StudentDAO {

	
	private EntityManager em;
	
	
	
	public StudentDAOImpl() {
		em=JPAUtil.getEntityManager();	}

	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public void upStudent(Student student) {
	em.merge(student);
	}

	@Override
	public void deleteStudent(Student student) {
		em.remove(student);
		
	}

	@Override
	public Student getStudentByID(int RollNo) {
		Student student=em.find(Student.class, RollNo );
		return student;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void comitTransaction() {
		em.getTransaction().commit();
		
	}

}
