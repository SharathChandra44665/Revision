package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "b"));
		System.out.println(Pattern.matches("[abc]", "c"));
		
		System.out.println(Pattern.matches("[abc]", "d"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]","aa"));
	}

}
