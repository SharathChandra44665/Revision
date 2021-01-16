package javaRegeX;

import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {
		boolean val=Pattern.matches(".s", "as");
		System.out.println(val);
	}

}
