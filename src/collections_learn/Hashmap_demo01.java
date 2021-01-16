package collections_learn;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_demo01 {

	public static void main(String[] args) {
		Map<String, Integer> val_map= Map.of("a",1,"b",2,"z",26);
		System.out.println(val_map);
		System.out.println(val_map.get("a"));
		System.out.println(val_map.size());
		System.out.println(val_map.containsKey("a"));
		System.out.println(val_map.containsValue(26));
//		System.out.println(user.get());
		System.out.println(val_map.keySet());
		System.out.println(val_map.values());
		Map<String, Integer> val_hash=new HashMap<String, Integer>(val_map);
		val_hash.put("val1", 234);
		System.out.println(val_hash);
		val_hash.put("a",101);
		System.out.println(val_hash);
		
	}

}
