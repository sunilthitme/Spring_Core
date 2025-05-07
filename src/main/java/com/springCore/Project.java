package com.springCore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Project {
	@Autowired
	@Qualifier("employee2")
	//we can call specific bean by using Qualifier Annotation
	private String name;

	public Project(String name) {
		super();
		this.name = name;
	}

	public Project() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting annotation of project");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ending annotations of project");
	}

	@Override
	public String toString() {
		return "Project [name=" + name + "]";
	}
}
