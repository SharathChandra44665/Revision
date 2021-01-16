package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo11 {
	public static void main(String[] args) {
		
		// beer breeze bheem brownee spicee  abcdeefff abcaeefffff
		System.out.println(Pattern.matches("[e]{2}", "ee"));
		
		System.out.println(Pattern.matches("[e]{2}", "ee"));
		System.out.println(Pattern.matches("[789]{1}", "789"));
		String s="beer";
		System.out.println(s.contains("ee"));
		System.out.println(Pattern.matches("[a-z]+[e]{2}+[a-z]{0,}", "abcaeeff"));
	}

}
