package com.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------------------");
       
	}
		
	}
 class EmployeeDemo {
	public static void main(String [] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "Vaishnavi", 20000));
		employee.add(new Employee(2, "Harshali", 40000));
		employee.add(new Employee(3, "Tushar", 60000));
		
		for (Employee emp : employee)
			emp.displayDetails();
	}
}


