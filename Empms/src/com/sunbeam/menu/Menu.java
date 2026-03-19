package com.sunbeam.menu;

import java.util.Scanner;

public class Menu {
	public static int MenuOptions(Scanner sc) {
		System.out.println("************************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Employee");
		System.out.println("2. Display All Employees");
		System.out.println("3. Find an Employee");
		System.out.println("4. Delete an Employee");
		System.out.println("5. Sort employees on salary in desc order");
		System.out.println("************************************");
		System.out.print("Enter the choice");
		return sc.nextInt();
	}
	

}
