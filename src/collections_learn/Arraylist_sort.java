package collections_learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_sort {

	public static void main(String[] args) {
		/*
		 * sorting
		 */
		List<Integer> numbers=List.of(20,15,200,3,25);
		List<Integer> all_numbers=new ArrayList<Integer>(numbers);
		Collections.sort(all_numbers);
		System.out.println(all_numbers);
	}

}
