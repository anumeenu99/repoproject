package reposample1.Encapsulation;

import java.util.*;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter your pin number: ");

		int pin = sc.nextInt();
		User user = new User();
		user.setPin(pin);
		int n = user.getPin();
		Bank bank = new Bank();

		if (bank.validatePin(n) == true) {
			System.out.println("Valid pin");
		} else {
			System.out.println("Invalid pin");
		}

}

	public boolean validatePin(int pin) {
		if ((pin == 1001) || (pin == 1234) || (pin == 1212)) {
			return true;
		} else {
			return false;
		}
	}
}
