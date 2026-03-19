package com.sunbeam.entity;

import java.util.Scanner;

public class Department {
	private int depid;
	private String dname;
	
	public Department() {
		super();
	}
	public Department(int depid, String dname) {
		super();
		this.depid = depid;
		this.dname = dname;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter department id");
		depid=sc.nextInt();
		System.out.println("Enter department name");
		dname=sc.next();
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", dname=" + dname + "]";
	}
	
	

}
