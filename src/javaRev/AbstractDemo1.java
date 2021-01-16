package javaRev;

public class AbstractDemo1 {

	public static void main(String[] args) {
		Motor m1=new DemoBike2();
		m1.run();
		
	}

}

abstract class  Motor{
	abstract void run();
}
class DemoBike2 extends Motor{
	void run() {
		System.out.println("Demo bike is running");
	}
}
