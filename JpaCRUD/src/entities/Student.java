package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//The below annotation define that given class is an Entity 
@Entity
@Table(name="Student")
public class Student {
	@Id
	private int RollNo;
	private String Name;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	//getters and setters method

	
	
	
}
