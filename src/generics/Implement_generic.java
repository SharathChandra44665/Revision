package generics;

import java.util.ArrayList;
import java.util.List;

public class Implement_generic <TYPE>{
	List<TYPE> my_list=new ArrayList<TYPE>();
	
	void add_elements(TYPE i) {
		my_list.add(i);
	}
	public void remove_element(TYPE value) {
		my_list.remove(value);
	}
	public TYPE get_value(int i) {
		return my_list.get(i);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return my_list.toString();
	}
}
