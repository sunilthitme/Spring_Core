package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp);
		
	}
}
