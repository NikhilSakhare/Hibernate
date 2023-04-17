package embedable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private String Dept;
	private Department department;
	private HOD hod;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public HOD getHod() {
		return hod;
	}

	public void setHod(HOD hod) {
		this.hod = hod;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Dept=" + Dept + ", department=" + department + "]";
	}
	
	
}
