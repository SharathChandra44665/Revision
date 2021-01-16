package collections_learn;

import java.util.HashSet;
import java.util.Set;

public class SetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits=Set.of("Banana", "apple", "mango","papaya");
		System.out.println(fruits);
		Set<String> fruits_hash=new HashSet<String>(fruits);
		fruits_hash.add("kiwi");
		System.out.println(fruits_hash);
	}

}
