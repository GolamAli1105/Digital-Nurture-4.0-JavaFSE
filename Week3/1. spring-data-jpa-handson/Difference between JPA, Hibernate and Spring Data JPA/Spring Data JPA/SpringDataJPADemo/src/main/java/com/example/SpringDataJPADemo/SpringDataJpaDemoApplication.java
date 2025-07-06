package com.example.SpringDataJPADemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringDataJpaDemoApplication implements CommandLineRunner {

	@Autowired
    private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
	   Employee emp = new Employee();
	   emp.setName("Bob");
	   emp.setDepartment("Finance");

	   employeeService.addEmployee(emp);
	   System.out.println("Employee added using Spring Data JPA");
	}
}
