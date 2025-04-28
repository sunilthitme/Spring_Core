package com.springCore;

public class Company {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company(String name) {
		super();
		this.name = name;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
