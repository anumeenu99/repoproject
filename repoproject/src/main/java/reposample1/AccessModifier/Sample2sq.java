package reposample1.AccessModifier;

public class Sample2sq {
	private int area;
	public static void print()
	{
		System.out.println("calling static method from different class");
	}

	 protected int square(int r) {
		area = r * r;
		System.out.println("area of square="+area);
		return area;
	}

}
