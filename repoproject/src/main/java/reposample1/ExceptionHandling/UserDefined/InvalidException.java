package reposample1.ExceptionHandling.UserDefined;

public class InvalidException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidException() {
		super();
	}

	InvalidException(String msg) {
		super(msg);
	}

}
