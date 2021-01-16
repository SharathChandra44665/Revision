package functional_programming;

import java.util.List;

public class Demo_sum_reduce_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> user_list=List.of(4,6,8,13,3,15);
		
		get_sum(user_list);
		odd_get_sum(user_list);
	}
	static void get_sum(List<Integer> list_value) {
		int sum=list_value.stream().reduce(0,
				(number1,number2)->number1+number2);
		System.out.println(sum);
	}
	static void odd_get_sum(List<Integer> list_value) {
		int sum=list_value.stream().filter(value-> (value%2==1)).reduce(0,(number1, number2)->number1+number2);
		System.out.println(sum);
	
	}
}
