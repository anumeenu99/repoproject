package reposample1.Exercise;
import java.util.*;
public class StudentDetailssub {
	static String address;
public static void main(String []args) {
	StudentDetails stu=new StudentDetails();
	stu.student();
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the address: ");
	address=obj.nextLine();
	
	System.out.println("Name: "+stu.name);
	System.out.println("Rollno: "+stu.rollno);
	System.out.println("Address: "+address);
	
}
}
