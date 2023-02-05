package dao;

import entities.Student;

public interface StudentDAO {
	
	//abstract method for CRUD
	void addStudent(Student student);
	void upStudent(Student student);
	void deleteStudent(Student student);
	Student getStudentByID(int RollNo);
	
	void beginTransaction();
	void comitTransaction();
}
