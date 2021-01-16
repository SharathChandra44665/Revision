package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo6 {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-z&&[dof]]", "d"));//false 
	}

}
