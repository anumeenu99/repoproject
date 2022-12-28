package reposample1.ExceptionHandling;

public class Operations {
public static void main(String []args) {
	Operations operations=new Operations();
	operations.operations(6, 0);
}
public void operations(int a,int b) {
	int sum=a+b;
	int sub=a-b;
	try {
		int quo=(a/b);
	}catch(ArithmeticException ex){
		System.out.println(ex.getMessage());
	}
	int prod=a*b;
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(prod);
}
}
