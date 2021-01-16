package collections_learn;

import java.util.HashMap;

public class Map_demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map_demo01 m=new Map_demo01();
		
		System.out.println(m.find_charecters("this is a string"));
	}
	
	HashMap<Character, Integer> find_charecters(String val) {
		int count=1;
		HashMap<Character, Integer> val_hash=new HashMap<Character, Integer>();
		
		char[] all_chars=val.toCharArray();
		for(char c: all_chars) {
			
			
			if(val_hash.containsKey(c)) {
				count=val_hash.get(c);
				count++;
				val_hash.put(c, count);
				count=1;
				
			}else {
				count=1;
				val_hash.put(c, count);
			}
		}
		return val_hash;
	}
}
