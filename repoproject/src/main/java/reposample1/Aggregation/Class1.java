package reposample1.Aggregation;

public class Class1 {
int l=5;
int m=2;
int mul;
public static void main(String []args) {
	Class1 obj=new Class1();
	obj.calculate();
}
public void calculate() {
	Class2 obj=new Class2();
	obj.sub();
	mul=l*m;
	int total=mul+obj.sub;
	System.out.println("mul= "+mul);
	System.out.println("total= "+total);
}
}
