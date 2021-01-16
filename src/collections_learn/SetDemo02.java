package collections_learn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo02 {
	public static void main(String[] args) {
		Set<Integer> numbers=new HashSet<Integer>();
		numbers.add(5423678);
		numbers.add(5423);
		numbers.add(542);
		numbers.add(54);
		numbers.add(5);
		System.out.println(numbers);
		
		
		Set<Integer> numbers_link_hash=new LinkedHashSet<Integer>();
		numbers_link_hash.add(5423678);
		numbers_link_hash.add(5423);
		numbers_link_hash.add(542);
		numbers_link_hash.add(54);
		numbers_link_hash.add(5);
		System.out.println(numbers_link_hash);
		numbers_link_hash.add(542367);
		System.out.println(numbers_link_hash);
		
		Set<Integer> numbers_tree=new TreeSet<Integer>();
		numbers_tree.add(5423678);
		numbers_tree.add(5423);
		numbers_tree.add(542);
		numbers_tree.add(54);
		numbers_tree.add(5);
		System.out.println(numbers_tree);
		numbers_tree.add(542367);
		System.out.println(numbers_tree);
	}
}
