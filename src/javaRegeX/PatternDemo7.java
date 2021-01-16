package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo7 {
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "l"));//false
		
		//be me lemon meow
		System.out.println(Pattern.matches("[A-Za-z][e]", "Me"));
		System.out.println(Pattern.matches("[A-Za-z][e]", "be"));
		
	}

}
