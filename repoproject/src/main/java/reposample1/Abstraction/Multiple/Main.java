package reposample1.Abstraction.Multiple;

public class Main implements Printing,Checking {
public static void main(String []args) {
	Main main=new Main();
	
	main.print();
	main.check();
}	
public void print() {
	System.out.println("printing");
}
public void check() {
	System.out.println("checking");
}
}
