package udemy_java;

import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calc= new SimpleInterestCalculator("4500","7.5");
		BigDecimal total_value= calc.calculate_total_value(5);
		System.out.println(total_value);
	}

}
