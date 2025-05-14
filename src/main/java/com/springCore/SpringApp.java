package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(context.getBean("employee",Employee.class));
		
	}
}
