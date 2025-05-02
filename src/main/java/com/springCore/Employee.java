package com.springCore;

public class Employee {
	private int id;
	private String name;
	private String address;
	private Company comp;


	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}

	public Employee() {
		super();
	}

	public Employee(int id, String name, String address,Company comp) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.comp = comp;

	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method ");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address +", comp=" +comp+"]";
	}

}
