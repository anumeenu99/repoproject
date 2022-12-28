package reposample1.Exercise;
import java.util.*;
public class HomeWork3 {
int fact=1;
	public static void main(String []args) {
		HomeWork3 obj=new HomeWork3();
		Scanner obj1=new Scanner(System.in);
		int z=obj1.nextInt();
		obj.print(z);
	}
	public int factorial(int n) {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public void print(int n) {
		int res=factorial(n);
		System.out.println("factorial is: "+res);
	}
}
