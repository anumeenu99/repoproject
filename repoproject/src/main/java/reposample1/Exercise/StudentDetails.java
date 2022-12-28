package reposample1.Exercise;
import java.util.*;
public class StudentDetails {
String name;
int rollno;
public void student() {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the name: ");
	name=obj.nextLine();
	
	System.out.println("enter the rollno: ");
	rollno=obj.nextInt();
}
}
