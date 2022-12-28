package reposample1.ExceptionHandling.ThrowsKeyword;

import java.io.IOException;

public class Sample1 {
public static void m1() throws IOException {
	m2();
}
public static void m2() throws IOException {
	m3();
}
public static void m3() throws IOException {
	throw new IOException("Exception throws");
}

public static void main(String[] args) {
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	System.out.println("REST OF CODE");
}

}
