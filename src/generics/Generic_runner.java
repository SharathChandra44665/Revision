package generics;

import java.util.ArrayList;
import java.util.List;

public class Generic_runner {

	static <TYPE> TYPE double_value(TYPE value){
		return value;
	}
	
	
	static<TYPE extends List> void make_dupliccate(TYPE value) {
		value.addAll(value);
		
	}
	public static void main(String[] args) {
		
		int i=double_value(Integer.valueOf(100));
		String s=double_value("sss");
		
		List<Integer> first_list=new ArrayList<Integer>(List.of(3,4,6));
		make_dupliccate(first_list);
		System.out.println(first_list);
		
		
		Implement_generic<String> m1=new Implement_generic<String>();
		m1.add_elements("apple");
		m1.add_elements("google");
		m1.add_elements("microsoft");
		m1.add_elements("dell");
		
		Implement_generic<Integer> m2=new Implement_generic<Integer>();
		m2.add_elements(100);
		m2.add_elements(25);m2.add_elements(105);
		m2.add_elements(50);
		m2.add_elements(110);
		
		String result1=m1.get_value(2);
		Integer result2=m2.get_value(2);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(result1);
		System.out.println(result2);
	}

}
