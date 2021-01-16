package udemy_java;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	String principal, interest;
	SimpleInterestCalculator(String principal, String interest){
		this.principal=principal;
		this.interest=interest;
	}
	
	BigDecimal calculate_total_value(int year) {
		BigDecimal p= new BigDecimal(this.principal);
		BigDecimal i= new BigDecimal(this.interest).divide(new BigDecimal("100"));
		BigDecimal yr=new BigDecimal(year);
		
		return p.add(p.multiply(i).multiply(yr));
	}
}
