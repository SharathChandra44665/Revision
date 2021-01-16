package collections_learn;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Queue_comparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}
	
}
public class Queues_demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> value_q=new PriorityQueue<String>(new Queue_comparator());
		System.out.println(value_q.poll());
		value_q.offer("apple");
		value_q.addAll(List.of("google", "sony", "videocon","lenovo","asus"));
//		System.out.println(value_q);
//		System.out.println(value_q.poll());
//		System.out.println(value_q.poll());
//		System.out.println(value_q.poll());
		
//		printing by its length
		System.out.println(value_q);
	}

}
