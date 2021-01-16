package collections_learn;

import java.util.Set;
import java.util.TreeSet;

public class Treeset_navigable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers=new TreeSet<Integer>(Set.of(120,45,11,20,12));
		System.out.println(numbers.floor(15));
		System.out.println(numbers.ceiling(15));
		System.out.println(numbers.higher(15));
		
		System.out.println(numbers.subSet(12, 60));
		System.out.println(numbers.subSet(12, 45));
		System.out.println(numbers.subSet(12,true, 45,true));
		System.out.println(numbers.subSet(12,false, 45,true));
		
		System.out.println(numbers);
		System.out.println(numbers.headSet(20));
		System.out.println(numbers.tailSet(20));
	}
	

}
