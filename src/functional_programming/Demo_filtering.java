package functional_programming;

import java.util.List;

public class Demo_filtering {

	public static void main(String[] args) {
		List<String> my_list=List.of("apple","google","microsoft","Linux");
		functional_programming(my_list);
		
		List<Integer> number_list=List.of(1,4,7,9);
//		get_even_numbers(number_list);
		get_odd_numbers(number_list);
	}
	static void functional_programming(List<String> value_list) {
		value_list.stream().filter(value -> value.endsWith("le")).forEach(value-> System.out.println(value));
	}
	
	static void get_even_numbers(List<Integer> list_value) {
		list_value.stream().filter( value -> (value%2)==0).forEach(value -> System.out.println(value));
	}
	static void get_odd_numbers(List<Integer> list_value) {
		list_value.stream().filter(value-> (value%2)==1).forEach(value -> System.out.println(value));
	}

}
