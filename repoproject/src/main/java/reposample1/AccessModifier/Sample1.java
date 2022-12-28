package reposample1.AccessModifier;

public class Sample1 {
	public static void main(String[] args) {
		Sample1 obj = new Sample1();
		obj.circle(4);
		print(10);
		//Square.print();
	}
	private static void print(int a)
	{
		int b=a;
		System.out.println("calling static method from its own class"+b);
	}

	public void circle(int r) {
		Sample2sq sq = new Sample2sq();  // access modifier-- private, protected
		int sqArea = sq.square(r);
		double area = 3.14 * sqArea;
		System.out.println("area of circle="+area);
		
	}
}

