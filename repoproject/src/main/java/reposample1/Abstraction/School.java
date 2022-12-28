package reposample1.Abstraction;

public class School extends Student {
	public static void main(String []args) {
	Student sc=new School();
	sc.getName();
	}
public void getName() {
	String name="Anu";
	System.out.println("Name= "+name);
}
}
