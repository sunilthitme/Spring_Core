package com.springCore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Company implements InitializingBean, DisposableBean{
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Destoye Method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init after property set");
		
	}
}
