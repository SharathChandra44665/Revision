package exception_handling;

public class Demo01_exception {

	public static void main(String[] args) {
		method1();
		System.out.println("main finished");//3
	}
	public static  void method1() {
		method2();
		System.out.println("method1 finished");//2
	}
	public static void method2() {
		try {
			String s=null;
			s.length();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("method2 finished");//1
	}
}
