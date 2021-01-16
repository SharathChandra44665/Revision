package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo12 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[e]{2,}", "eeeeeee"));
		
		System.out.println(Pattern.matches("[e]{2,}", "eeeeeees"));//false essee
	}

}
