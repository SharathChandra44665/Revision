package javaRev;

public class Demo2CheckFinal 	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comp c1=new Comp();
		c1.method1();
	}

}

final class Comp{
	final public void method1() {
		System.out.println("method1");
	}
}