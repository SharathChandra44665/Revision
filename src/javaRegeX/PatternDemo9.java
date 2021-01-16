package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo9 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a]+", "a"));
		System.out.println(Pattern.matches("[a]+", "aaaa"));
		
		//lemon,meow, seal 
		System.out.println(Pattern.matches("[a-zA-Z][e][a-z]+", "lemon"));
		System.out.println(Pattern.matches("[a-zA-Z][e][a-z]+", "meow"));
		System.out.println(Pattern.matches("[a-zA-Z][e][a-z]+", "Dear"));
		
		System.out.println(Pattern.matches("[a-zA-Z][e][a-z]+", "angular"));
		System.out.println(Pattern.matches("[a]+", "aaba"));//aaba
		System.out.println(Pattern.matches("[a]+", "baaa"));
		
		
		
	}

}
