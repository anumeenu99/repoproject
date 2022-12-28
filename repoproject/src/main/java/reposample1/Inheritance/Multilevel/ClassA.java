package reposample1.Inheritance.Multilevel;

public class ClassA extends ClassB {
 public static void main(String []args) {
	 ClassA obj=new ClassA();
	 obj.multilevel();
	 obj.sample();
	 obj.testing();
 }
 public void multilevel() {
	 System.out.println("Multilevel Inheritance..");
 }
}
