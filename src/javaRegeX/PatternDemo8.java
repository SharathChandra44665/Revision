package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo8 {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[m-z]?", "m"));
		System.out.println(Pattern.matches("[amn]?", "a"));
	}

}
