package core.spring;

public class Employee {

	private int id;
	private String name;
	private String address;

	public Employee(String name, String address) {
		super();
		System.out.println("Construtor With Three");
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name) {
		super();
		System.out.println("Construtor With Two");

		this.id = id;
		this.name = name;
	}

	public Employee(int id) {
		super();
		System.out.println("Construtor With One");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}


	
	

}
