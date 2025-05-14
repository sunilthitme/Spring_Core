package com.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springCore.JavaConfig")
public class JavaConfig {
	
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		return employee;
	}
}
