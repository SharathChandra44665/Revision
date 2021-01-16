package collections_learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class List_demo {

	public static void main(String[] args) {
		List<String> words=List.of("hello","dog","cat","parrot");
//		System.out.println(words.get(1));
//		System.out.println(words.size());
//		words.add("some text");
//		System.out.println(words.size());
		List<String> random_words=new Vector<String>(List.of("google","yahoo"));
		random_words.add("sharath");
		System.out.println(random_words);
		List<String> all_words=new ArrayList<String>();
		all_words.addAll(random_words);
		all_words.addAll(words);
		System.out.println(all_words);
		all_words.add(2, "hello");
		System.out.println(all_words);
		all_words.remove("hello");
		System.out.println(all_words);
		all_words.set(4, "bing");
		System.out.println(all_words);
		for(String w: all_words) {
			System.out.print(w+"\t");
		}
		
		Iterator iterate_word=all_words.iterator();
		while (iterate_word.hasNext()) {
			System.out.println(iterate_word.next());
			
		}
	}

}
