package com.sunbeam.entity;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Department department;
	


	public Employee() {
		department = new Department();
	}
	
	public Employee(int id, String name, double salary,int depid,String dname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = new Department(depid, dname);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDeparttment(Department department) {
		this.department = department;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter id of employee");
		id=sc.nextInt();	
		System.out.println("Enter name of employee");
		name=sc.next();	
		System.out.println("Enter salary of employee");
		salary=sc.nextDouble();	
		
		department.accept(sc);
		
		
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departtment=" + department + "]";
	}
	
	
}
