package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo5 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-d[m-p]]", "a"));//true
		System.out.println(Pattern.matches("[a-d[m-p]]", "o"));//true
	}

}
