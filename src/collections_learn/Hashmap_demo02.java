package collections_learn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
/*
 * 214 implementation
 */

public class Hashmap_demo02 {

	public static void main(String[] args) {
		HashMap<String, Integer> val_hash=new HashMap<String, Integer>();
		val_hash.put("f", 121);
		val_hash.put("a", 101);
		val_hash.put("L", 520);
		val_hash.put("z", 220);
		System.out.println(val_hash);
		
//		as per insertion
		LinkedHashMap<String, Integer> val_link=new LinkedHashMap<String, Integer>();
		val_link.put("cool", 13);
		val_link.put("college", 12);
		val_link.put("apple", 40);
		val_link.put("orange", 25);
		System.out.println(val_link);
		
//		does in sort order
		TreeMap<String, Integer> val_tree=new TreeMap<String, Integer>();
		val_tree.put("cool", 13);
		val_tree.put("college", 12);
		val_tree.put("apple", 40);
		val_tree.put("orange", 25);
		System.out.println(val_tree);
	}

}
