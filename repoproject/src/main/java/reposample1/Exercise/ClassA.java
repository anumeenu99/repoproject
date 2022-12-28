package reposample1.Exercise;
import java.util.*;
public class ClassA {
	
int basicpay;
int bonus;
int deduction;



public void getSalary()
{
	 Scanner obj=new Scanner(System.in);
	 System.out.print(" your basic pay=");
	   this.basicpay=obj.nextInt();
	  
	 System.out.print(" your bonus amount=");
	 this.bonus=obj.nextInt();
	 
	 System.out.print(" your deduction amount=");
	  this.deduction=obj.nextInt();

}

}
