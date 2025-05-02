package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)context.getBean("employee");
		
		System.out.println(emp);
		context.registerShutdownHook();
		
		Company comp=(Company)context.getBean("comp");
		System.out.println(comp);
		
		Project proj=(Project) context.getBean("project");
		System.out.println(proj);
		
	}
}
