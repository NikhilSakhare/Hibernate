package embedable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Department {

	private int depId;
	private String deptName;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", deptName=" + deptName + "]";
	}
	
	
	
	
}
