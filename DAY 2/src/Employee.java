import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee {
	String fname;
	String lname;
	double salary;
	
	public Employee (String fname,String lname,double salary ){
		this.fname= fname;
		this.lname=lname;
		
		if (salary >0) {
			this.salary=salary;
		}else {
			System.out.println("invalid salary");
		}
		
			
			
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	 public double getyearlysal() {
		 return salary*12;
	 }
	
	public static void main(String[] args) {
		
		Employee e1= new Employee("Amit","Lanke",);
		Employee e2= new Employee("Sushant","Kale",6500.50);
		
		
		System.out.println("yearly salary of e1 is "+e1.getFname()+" "+e1.getLname()+" is "+e1.getyearlysal());
		System.out.println("yearly salary of e2 is "+e2.getFname()+" "+e2.getLname()+" is "+e2.getyearlysal());;

		
		System.out.println("Salaries after raise");
		double raise1 = e1.getyearlysal()*0.10;
		double raise2 = e2.getyearlysal()*0.10;
		
		System.out.println("yearly salary of e1 is "+e1.getFname()+" "+e1.getLname()+" is "+(e1.getyearlysal()+raise1));
		System.out.println("yearly salary of e2 is "+e2.getFname()+" "+e2.getLname()+" is "+(e2.getyearlysal()+raise2));
		
		
	}

}
