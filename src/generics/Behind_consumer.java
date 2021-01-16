package generics;

import java.util.List;
import java.util.function.Consumer;
class Create_counsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer val) {
		// TODO Auto-generated method stub
		System.out.print(val+" ");
	}
	
}
public class Behind_consumer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> user_list=List.of(2, 52, 14,5,23,13, 100, 10);
		user_list.stream().filter(val-> (val%2==1)).forEach(val-> System.out.print(val+" "));
		System.out.println();
		user_list.stream().filter(val->(val%2==1)).forEach(new Create_counsumer());
		System.out.println();

	}

}
