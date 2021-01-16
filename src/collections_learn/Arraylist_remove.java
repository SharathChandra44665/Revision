package collections_learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_remove {

	public static void main(String[] args) {
		/*
		 * this is not a good way
		 */
		List<String> my_words=List.of("animal", "dog", "cat", "bat");
		List<String> words=new ArrayList<String>(my_words);
		for(String w: words) {
			if( w.endsWith("at")) {
				words.remove(w);
			}
		}
		System.out.println(words);
		words.add("cat");
		System.out.println(words);
		
		Iterator<String> remove_words=words.iterator();
		while (remove_words.hasNext()) {
			if(remove_words.next().endsWith("at")) {
				remove_words.remove();
			}
		}
		System.out.println(words);
	}

}
