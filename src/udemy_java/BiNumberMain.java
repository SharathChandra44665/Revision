package udemy_java;

public class BiNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiNumbers numbers=new BiNumbers(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleNumber();
		System.out.println(numbers.getN1());
		System.out.println(numbers.getN2());
	}

}
