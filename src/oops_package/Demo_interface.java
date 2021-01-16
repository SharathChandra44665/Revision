package oops_package;

public interface Demo_interface {
	public void method1();
//	public void method2();
	default public void method3() {
		System.out.println("this is a default method");
	}

}
