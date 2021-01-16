package udemy_java;

public class MyNumber {
	private int number;
	MyNumber(int number){
		this.number=number;
	}
	int sum_of_divisors() {
		int sum=0;
		for(int i=1;i<number;i++) {
			if(i>1) {
				if(number%i==0) {
					sum+=i;
				}
			}
		 
		}
		return sum;
	}
	
	void print_number_triangle() {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
