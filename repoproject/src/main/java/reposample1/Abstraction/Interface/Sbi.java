package reposample1.Abstraction.Interface;

public class Sbi implements Bank{
	public static void main(String []args) {
		Bank sbi=new Sbi();
		sbi.getAccountDetails();
		
		Bank hdfc=new HDFC();
		hdfc.getAccountDetails();
	}
public void getAccountDetails() {
	int accountnum=11112225;
	String branch="xyz";
	System.out.println("account number: "+accountnum);
	System.out.println("Branch: "+branch);
}
}
