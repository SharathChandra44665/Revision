package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-z]", "a"));//true
		System.out.println(Pattern.matches("[a-zA-Z]", "A"));
		System.out.println(Pattern.matches("[A-Za-z]", "B"));
		
		System.out.println(Pattern.matches("[a-z]", "A"));//false
	}

}
