package collections_learn;

import java.util.TreeMap;

public class Tree_map_demo {

	public static void main(String[] args) {
		TreeMap<String, Integer> tree=new TreeMap<String, Integer>();
		tree.put("z", 125);
		tree.put("al", 52);
		tree.put("majo", 85);
		tree.put("ab",32);
		tree.put("y",45);
		tree.put("j",44);
		tree.put("o",74);
		System.out.println(tree);
		System.out.println(tree.higherKey("al"));//next higher
//		creating submap
		System.out.println(tree.subMap("c", "q"));
		//z is not inclusive
		System.out.println(tree.subMap("m", "z"));
		System.out.println(tree.subMap("m",true,"z",true));
	}

}
