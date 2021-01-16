package generics;

import java.util.List;

public class Generics_runner_demo02 {
//	upper bound wild carts
	static double make_sum(List<? extends Number> nos) {
		double sum=0;
		for(Number no: nos) {
			sum+=no.doubleValue();
		}
		return sum;
	}
	
//	lower bound wild carts
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(make_sum(List.of(3,5,7)));
		System.out.println(make_sum(List.of(3.5,5.5,7.7)));
		System.out.println(make_sum(List.of(3l,5l,7l)));
	}

}
