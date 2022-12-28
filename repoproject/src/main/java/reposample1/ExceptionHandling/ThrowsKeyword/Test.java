package reposample1.ExceptionHandling.ThrowsKeyword;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception io) {
			System.out.println("input not found");
		}

	}

	public static void test() throws IOException {
		throw new IOException();
	}
}
