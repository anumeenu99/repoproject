package reposample1.Exercise;

public class StringtoInt {
	String s="100";
public static void main(String []args) {
	StringtoInt obj=new StringtoInt();
	obj.strInt();
	
}
public int strInt() {
	
	int i=Integer.parseInt(s);
	System.out.println(i);
	return i;
}
}
