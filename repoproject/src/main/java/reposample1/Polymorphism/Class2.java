package reposample1.Polymorphism;

public class Class2 extends Class1 {
public static void main(String []args) {
	Class2 obj=new Class2();
	System.out.println(obj.add(20,50));
}
	@Override
	public int add(int z,int y) {
		int sum=z+y;
		return sum;
}
	
}
