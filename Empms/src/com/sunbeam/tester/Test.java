package com.sunbeam.tester;

import com.sunbeam.entity.*;
import com.sunbeam.menu.Menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	private static void diaplay(List<Employee> emp) {
		for (Employee e : emp)
			System.out.println(e);		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee> emp=new ArrayList<>();
		
		int choice;
		
		while((choice=Menu.MenuOptions(sc))!=0) {
			
			switch (choice) {
			case 1:
				Employee e =new Employee();
				e.accept(sc);
				emp.add(e);
				break;
			case 2:
				for (Employee e1 : emp)
					System.out.println(e1);
				break;
			case 3:
				System.out.println("Enter id no to find");
				Employee e2=new Employee();
				e2.setId(sc.nextInt());
				int index=emp.indexOf(e2);
				
				if(index!=-1)
				System.out.println(emp.get(index));
				break;
	
			case 4:{
				System.out.println("enter id to remove");
				Employee e3 = new Employee();
				e3.setId(sc.nextInt());
				if (emp.remove(e3))
					System.out.println("Employee removed successfully");
				else
					System.out.println("Removing employee failed");
			break;
			}
				
			case 5:
				class EmpsalComparator implements Comparator <Employee>{

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return Double.compare(o2.getSalary(), o1.getSalary());
					}
					
				}
				emp.sort(new EmpsalComparator());
				diaplay(emp);
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		}
	}

	

	

}
