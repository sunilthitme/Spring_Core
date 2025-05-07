package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee e=context.getBean("employee",Employee.class);
		System.out.println(e);
	}
}
