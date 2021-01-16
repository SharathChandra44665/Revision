package javaRegeX;

import java.util.regex.Pattern;

public class PatternDem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-c]*", "d"));
		System.out.println(Pattern.matches("[amn]*", "wrong"));
		
		

	}

}
