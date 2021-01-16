package generics;

import java.util.List;
import java.util.stream.IntStream;

import javax.management.ValueExp;

public class Demo_map01 {

	public static void main(String[] args) {
		List<String> words=List.of("Apple","Linux", "Microsoft","Android");
		List<Integer> n=List.of(12,52,14,100, 13, 7);
		print_ten_numbers();
		square_ten_numbers();
		make_lower(words);
		get_word_length(words);
		System.out.println(get_max_number(n));
		
	}
	
	static void print_ten_numbers() {
		IntStream.range(1,11).forEach(value-> System.out.print(value+" "));
		System.out.println();
	}
	
	
	static void square_ten_numbers() {
		IntStream.range(1, 11).map(value-> (value*value)).forEach(value-> System.out.print(value+" "));
		System.out.println();
	}
	
	static void make_lower(List<String> list_words) {
		list_words.stream().map(value-> value.toLowerCase()).forEach(value-> System.out.print(value+" "));
		System.out.println();
	}
	
	static void get_word_length(List<String> list_words) {
		list_words.stream().map(value-> value.length()).forEach(value->System.out.print(value+" "));
		System.out.println();
	}
	
	static int get_max_number(List<Integer> number_list) {
		return number_list.stream().max((n1,n2)->Integer.compare(n1, n2)).get();
	}
}
