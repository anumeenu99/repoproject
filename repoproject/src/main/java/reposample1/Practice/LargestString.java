package reposample1.Practice;

public class LargestString {
	public static void main(String[] args) {
		String s = "hello friend how are you";
		String str[] = s.split(" ");
		String small = str[0], large = str[0];
		for (int i = 0; i < str.length; i++) {
			if (small.length() > str[i].length()) {
				small = str[i];
			}
			if (large.length() < str[i].length()) {
				large = str[i];
			}
		}
		System.out.println("Smallest word: " + small);
		System.out.println("Largest word: " + large);
	}
}
