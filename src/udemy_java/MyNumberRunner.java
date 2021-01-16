package udemy_java;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number=new MyNumber(9);
		int sum_of_divisors=number.sum_of_divisors();
		System.out.println("sum_of_divisors: "+sum_of_divisors);
		number.print_number_triangle();
	}

}
