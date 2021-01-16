package udemy_java;

import java.util.Arrays;

public class Arrays_demo1 {

	public static void main(String[] args) {
		int[] marks=new int[5];
		Arrays.fill(marks, 89);
		System.out.println(Arrays.toString(marks));
		
		int[] a1= {1,2,3};
		int[] a2= {1,2,3};
		int[] a3= {3,2,1};
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.equals(a1, a3));
		
//		sorting array
		int[] unsorted= {22,11,4,66,3,5,33,22};
		Arrays.sort(unsorted);
		System.out.println(Arrays.toString(unsorted));

	}

}
