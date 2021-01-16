package collections_learn;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unique_charecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> my_char=List.of('A','Z','A','B','Z','F');
		
		//want unique in acending order 
		Set<Character> unique_char_ascending=new TreeSet<Character>(my_char);
		System.out.println("treeset: "+unique_char_ascending);
		
		
		Set<Character> unique_as_inserted=new LinkedHashSet<Character>(my_char);
		System.out.println();
		
	}

}
