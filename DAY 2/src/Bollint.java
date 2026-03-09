import java.util.Scanner;

public class Bollint {
	
	
	

	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first num");
			if(!(sc.hasNextDouble()&&sc.hasNextInt())) {
				double a=sc.nextDouble();
				
				System.out.println("Enter second num");
				if(!(sc.hasNextDouble()&&sc.hasNextInt())) {
					double b=sc.nextDouble();
					
					double average=(a+b)/2.0;
					System.out.println("average of a+b is"+average);
				}else {
					System.out.println("enter valid number");
				}
				
			}else {
				System.out.println("enter valid no");
			}
			
			
			
			
		}

	}


