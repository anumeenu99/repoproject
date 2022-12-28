package reposample1.Exercise;

public class ClassB {

	public int hr(int basicpay) {

		System.out.println(basicpay);
		int hra = (basicpay * 5) / 100;
		System.out.println("hra=" + hra);
		return hra;

	}

	public int getpf(int basicpay) {
		System.out.println(basicpay);
		int pf = (basicpay * 20) / 100;
		System.out.println("pf=" + pf);
		return pf;
	}

}
