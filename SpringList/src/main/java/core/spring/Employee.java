package core.spring;

import java.util.List;
import java.util.Map;

public class Employee {

	private int id;
	private List<String> name;
	private Map<Integer, String> empName;
	
	public Map<Integer, String> getEmpName() {
		return empName;
	}
	public void setEmpName(Map<Integer, String> empName) {
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getName() {
		return name;
	}
	public void setName(List<String> name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empName=" + empName + "]";
	}
	
	
	
	
	
	
}
