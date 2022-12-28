package reposample1.Practice;

public class Sample1 {
	public static void main(String[] args) {

		String a = "hello";
		String b = "hai..";
		String joined = a.concat(b);
		System.out.println("joined " + joined);
		
		String c="how \"are\" you";
		System.out.println(c);
		
		boolean d=a.contains("s");
		System.out.println(d);
		
		System.out.println(a.substring(0,5));   //substring
		System.out.println(a.substring(2));   //substring with only end index(starts from here)
		
		String z=String.join(" ",a,b);
		System.out.println(z);
		
		System.out.println(a.replace('e','a'));
		
		String y="java123programming";
		String regex="\\d";
		System.out.println(y.replaceAll(regex, " "));
		
		System.out.println(a.charAt(0));
		
		
	}
}
