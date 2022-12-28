package reposample1.Exercise;

public class AdditionSub extends Addition{
	public static void main(String []args) {
		AdditionSub obj=new AdditionSub();
		obj.add();
		
	}
	public void add() {
		int res=super.addition();
		
		System.out.println("sum= "+res);
		 if(res%10==0) {
			 System.out.println("number is divisible by 10");
		 }
		 else {
			 System.out.println("number is not divisible by 10");
		 }
	}
}
