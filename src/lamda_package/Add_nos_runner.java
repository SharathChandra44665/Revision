package lamda_package;

public class Add_nos_runner {

	public static void main(String[] args) {
		Add_nos sum=(a,b)->a+b;
		int s=sum.sum(100, 200);
		System.out.println(s);
	}

}
