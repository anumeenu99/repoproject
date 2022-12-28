package reposample1;

public class Circle {

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.circle(4);
		
	}
	public void circle(int r) {
		Square sq = new Square();  // aggregation
		int sqArea = sq.square(r);
		double area = 3.14 * sqArea;
		System.out.println("area of circle="+area);
		
	}

}