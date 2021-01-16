package exception_handling;

public class Demo02_try_catch {

	public static void main(String[] args) {
		try {
			System.out.println("hello");
			int[] a= {1,3,5};
			System.out.println(a[4]);
			
		}finally {
			System.out.println("inside finally block");
		}
	}

}
