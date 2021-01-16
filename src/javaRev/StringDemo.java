package javaRev;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Sharath";
		String ss1="Sharath";
		String s2=new String("Sharath");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(ss1));//true
		System.out.println(s1==ss1);//true
		

	}

}
