package reposample1.Exercise;

public class ClassC extends ClassA {

	public static void main(String[] args) {
		
		//System.out.println("Debugg");

		ClassC obj1 = new ClassC();
		obj1.getSalary();
		obj1.totalSalary(obj1.basicpay);

	}

	public void totalSalary(int basicpay) {

		ClassB obj1 = new ClassB();

		int m = obj1.hr(basicpay);
		int n = obj1.getpf(basicpay);

		System.out.println("your basic pay is: " + basicpay);
		System.out.println("your deduction amount: " + deduction);
		System.out.println("your bonus is: " + bonus);
		System.out.println("your hra amount: " + m);
		System.out.println("your pf amount: " + n);

		int ts = (basicpay + m - n - deduction + bonus);
		System.out.println("total salary is " + ts);

		System.out.println("your total salary: " + ts);
	}

}
