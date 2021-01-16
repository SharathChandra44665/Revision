package functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Demo_runner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > my_list=List.of("apple","google","microsoft","cisco");
//		print_list(my_list);
		print_with_fp(my_list);
	}

	 static void print_list(List<String> my_list) {
		for(String value: my_list) {
			System.out.println(value);
		}
		
	}
	 
	 static void print_with_fp(List<String> value_list) {
		 value_list.stream().forEach(value -> System.out.println(value));
	 }
	
	

}
