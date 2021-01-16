package javaRev;

public class Demo_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		String s="this is a string";
		char[] a= s.toCharArray();
		char[] c= {};
		int[] n= {};
		for(int i=0;i<a.length;i++) {
			if(c[i]==a[i]) {
				count++;
			}
			c[i]=a[i];
		}
	
	}

}
