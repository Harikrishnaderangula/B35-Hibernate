package singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


//to demonstrate the example on single table inheritance
@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
