package project1;

import java.util.Scanner;
	
public class class2 {
		
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. choice 2");
		System.out.println("2. choice 3");
		System.out.println("3. choice 3");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		return choice;
		
	}
		
	public static void main(String[] args) {
		
		int choice;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("choice one selected");
				break;
				
			case 2:
				System.out.println("choice two selected");
				break;
				
			case 3:
				System.out.println("choice three selected");
				break;
				
			default:
				System.out.println("invalic choice");
				break;
				
			}
			
		}

		System.out.println("process exited");
 	}

}
