package client;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		
		student.setRollNo(214104);
		student.setName("Kalpana");
		service.create(student);
		
		System.out.println("The data is  inserted");
		}

}
