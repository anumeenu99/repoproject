package reposample1.Abstraction.Exercise;

public class Contractor extends Employee {
	
	
	public void calculateSalary(int workinghour) {
		
		int payment=2000;
		int totalpayment=workinghour*payment;
		System.out.println("total payment of contract employee: "+totalpayment);
	}
}
