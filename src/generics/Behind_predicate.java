package generics;

import java.util.List;
import java.util.function.Predicate;
class create_predicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer val) {
		// TODO Auto-generated method stub
		return val%2==1;
	}
	
}

public class Behind_predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> user_list=List.of(2, 52, 14,5,23,13, 100, 10);
		user_list.stream().filter(val-> (val%2==1)).forEach(val-> System.out.print(val+" "));
		System.out.println();
		user_list.stream().filter(new create_predicate()).forEach(val-> System.out.print(val+" "));
	}

}
