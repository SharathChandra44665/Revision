package javaRev;

public class Calculate {
	static int x=0;
	public Calculate(int a) {
		this.x=a;
	}
	static int cube() {
		return x*x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculate(10);
		System.out.println(Calculate.cube());
	}

}
