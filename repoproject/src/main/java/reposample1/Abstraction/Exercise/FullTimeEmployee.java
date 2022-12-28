package reposample1.Abstraction.Exercise;

public class FullTimeEmployee extends Employee {
@Override
public void calculateSalary(int workinghour) {
	int payment=3000;
	int totalpayment=workinghour*payment;
	System.out.println("total payment of full_time_employee: "+totalpayment);
}
}
