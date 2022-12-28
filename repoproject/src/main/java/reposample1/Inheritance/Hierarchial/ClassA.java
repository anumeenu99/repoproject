package reposample1.Inheritance.Hierarchial;

public class ClassA {
	public static void main(String []args) {
		ClassA obj=new ClassA();
		obj.sample3();
		ClassB obj1=new ClassB();
		obj1.hierarchial();
	}
	public void sample3() {
		System.out.println("Hierarchial inheritance..");
	}
}
