package reposample1.Abstraction.Exercise;

public class SuperClass {
	public static void main(String []args) {
		Employee cc=new Contractor();
		cc.calculateSalary(7);
		
		Employee ft=new FullTimeEmployee();
		ft.calculateSalary(8);
	
}
}
