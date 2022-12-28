package reposample1.Aggregation;

public class Class2 {
int b=20;
int a=30;
int sub;
public static void main(String []args) {
	Class2 obj=new Class2();
	obj.sub();
}
public void sub() {
	sub=a-b;
	System.out.println("sub= "+sub);
}
}
