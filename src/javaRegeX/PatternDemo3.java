package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo3 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[^abc]", "d"));//alt+94 true
		
		System.out.println(Pattern.matches("[^abc]", "a"));//false
	}

}
