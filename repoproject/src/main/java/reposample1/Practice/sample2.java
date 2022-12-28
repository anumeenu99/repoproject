package reposample1.Practice;

public class sample2 {
	static int a = 10;
	static int b = 3;

	public static void main(String[] args) {
		operation();
		try {
			int quo=a/0;		
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}
		public static void operation() {
			int sum=a+b;
			System.out.println(sum);
			throw new ArithmeticException("number not divisible by 0"); 
	}
}
