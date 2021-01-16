package generics;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Terminal_operations_demo01 {

	public static void main(String[] args) {
		List<Integer> n=List.of(12,52,14,100, 13, 7,10);
		
		System.out.println(get_max_number(n));
		System.out.println(get_min_number(n));
		get_odd_numbers(n);
		get_odd_number_list(n);
		get_even_number_list(n);
		get_first_n_square_list(8);
		
	}
	static int get_max_number(List<Integer> number_list) {
		return number_list.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
	}
	
	static int get_min_number(List<Integer> number_list) {
		return number_list.stream().min((n1,n2)->Integer.compare(n1, n2)).get();
	}
	static void get_odd_numbers(List<Integer> number_list) {
		number_list.stream().filter(n-> (n%2==1)).forEach(n->System.out.print(n+" "));
		System.out.println();
		
	}
	
	static void get_odd_number_list(List<Integer> number_list){
		System.out.println(number_list.stream().filter(n-> (n%2==1)).collect(Collectors.toList()));
	}
	
	static void get_even_number_list(List<Integer> number_list) {
		System.out.println(number_list.stream().filter(n->(n%2==0)).collect(Collectors.toList()));
	}
	
	static void get_first_n_square_list(int n) {
		System.out.println(IntStream.range(0, n+1).map(val-> (val*val)).boxed().collect(Collectors.toList()));
	}
}
