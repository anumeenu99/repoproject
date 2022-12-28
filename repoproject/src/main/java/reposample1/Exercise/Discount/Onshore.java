package reposample1.Exercise.Discount;
import java.util.*;
public class Onshore {

	public static void main(String []args) {
		int total;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the total amount: ");
		total=obj.nextInt();
		System.out.println("select season\n 1.onseason \n 2.offseason");
		int num=obj.nextInt();
		if(num==1) {
			Onshore obj1=new Onshore();
			obj1.discount(total);
		}
		else {
			Offshore obj2=new Offshore();
			obj2.discount(total);
		}
	}
		public void discount(int total) {
			int discount=(total*40)/100;
			System.out.println("total purchased:"+total);
			System.out.println("discount:"+discount);
			System.out.println("total after discount: "+(total-discount));
			
		}
		
		
}
