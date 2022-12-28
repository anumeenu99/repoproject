package reposample1.Inheritance.Multilevel;

import reposample1.Inheritance.Single.Practice1;

public class Practice extends Practice1{
	int a=10;
	public static void main(String []args)
	{
		Practice obj=new Practice();
		obj.apu();
		Practice1 obj1=new Practice1();
		obj.appu();
	}
	public void apu()
	{
		System.out.println("a="+a);
	}
}
