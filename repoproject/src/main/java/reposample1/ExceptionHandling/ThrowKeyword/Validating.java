package reposample1.ExceptionHandling.ThrowKeyword;

public class Validating {
	public static void main(String[] args) {
		validate(12);
	}

	public static void validate(int age) {
		try {
			if (age >= 18) {

				System.out.println("eligible");
			} else {
				throw new ArithmeticException("invalid age");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
