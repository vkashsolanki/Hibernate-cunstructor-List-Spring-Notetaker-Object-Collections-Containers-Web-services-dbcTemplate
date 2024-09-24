package core.spring;

public class Employee {

	private int id;
	private String name;
	private String address;
	
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}


}
