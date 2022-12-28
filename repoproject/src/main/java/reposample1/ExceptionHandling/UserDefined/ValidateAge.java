package reposample1.ExceptionHandling.UserDefined;

public class ValidateAge {
	public static void validate(int age) {

		if (age >= 18) {
			System.out.println("eligible");
		} else {
			throw new InvalidException("invalid age");
		}

	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidException ex) {
			ex.printStackTrace();
		}
	}
}
