package reposample1.Exercise;

public class HomeWork2 {
	int n, rem, res = 0;

	HomeWork2() {
		System.out.println("finding reverse");
	}

	HomeWork2(int num) {
		this();
		n = num;
	}
	
	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2(123);
		int result = obj.reverse();
	}

	public int reverse() {
		System.out.println("number:" + n);
		while (n != 0) {
			rem = n % 10;
			res = (0 * 10) + rem;
			n = n / 10;
			System.out.print(res);
		}
		return res;
	}

}
