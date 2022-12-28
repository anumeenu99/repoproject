package reposample1.Exercise.Discount;

public class Offshore {
	public void discount(int total) {
	int discount=(total*15)/100;
	System.out.println("total purchased:"+total);
	System.out.println("discount:"+discount);
	System.out.println("total after discount: "+(total-discount));
}
}
