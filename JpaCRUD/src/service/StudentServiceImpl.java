package service;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import entities.Student;

public class StudentServiceImpl implements StudentService{

	
	private StudentDAO dao;
	
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDAOImpl();
	}

	@Override
	public void create(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.comitTransaction();
		
	}

	@Override
	public void update(Student student) {
		dao.beginTransaction();
		dao.upStudent(student);
		dao.comitTransaction();
		
	}

	@Override
	public void delete(Student student) {
		dao.beginTransaction();
		dao.deleteStudent(student);
		dao.comitTransaction();
		
	}

	@Override
	public Student retrieve(int RollNo) {
		Student student=dao.getStudentByID(RollNo);		
		return student;
	}

}
