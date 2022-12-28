package reposample1.Abstraction.Interface.Exercise;

public class HDFC implements RBI {
	int amount = 5000;
	int duration = 7;

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.recurringDeposit();
	}

	public void recurringDeposit() {

		int total = ((amount * interest_rate * duration) / 100) + amount;
		System.out.println("total amount: " + total);
	}
}
