package udemy_java;

//import java.io.BufferedInputStream;

public class Demo_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.min(215, 12));
		System.out.println("***following will give you table***");
//		System.out.println("enter your number");
		int no=5;
		for(int i=1;i<=10;i++) {
			System.out.println(no +"X"+i+"= "+(no*i));
		}
//		byte value=127;
		
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		for(int x=1;x<=10;x++) {
			System.out.println("square of "+x+" is: "+(x*x));
			
		}
		System.out.println("\n\nfor even numbers: ");
		for(int x=1;x<10;x++) {
			System.out.println((2*x)*(x*2));
//			2*1	*	2*1
//			2*2	*	2*2
//			2*3	*	2*3
//			...
		}
		System.out.println("\n\nfor odd numbers: ");
		/*
		for(int x=1;x<=10;x++) {
//			if(x%2==1)
//			System.out.println((3*x)*(x*3));
			
			
		}*/
		for(int i=1;i<20;i=i+2) {
			System.out.println(i*i);
		}
	}

}
