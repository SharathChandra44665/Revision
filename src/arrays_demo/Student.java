package arrays_demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> list_of_marks=new ArrayList<Integer>();
	
	public Student(String name, int... list_of_marks) {
		this.name=name;
		for(int marks: list_of_marks) {
			this.list_of_marks.add(marks);
		}
	}
	
	int get_number_of_marks() {
		return list_of_marks.size();
	}
	
	int get_total_sum_marks() {
		int sum=0;
		for(int m: list_of_marks) {
			sum+=m;
		}
		return sum;
	}
	int get_max_mark() {
		/*
		int big=0;
		for(int m: list_of_marks) {
			if(m>big) {
				big=m;;
			}
		}
		return big;
		*/
		return Collections.max(list_of_marks);
	}
	
	int get_second_highest() {
		int second_big=0;
		int big=get_max_mark();
		
		for(int m: list_of_marks) {
			if(m<big && m>second_big) {
				second_big=m;
			}
		}
//		System.out.println(second_big);
		return second_big;
		
	}
	
	int get_min_mark() {
//		int small=list_of_marks.get(0);
//		for(int i=0;i<list_of_marks.size();i++) {
//			if(list_of_marks.get(i)<small) {
//				small=list_of_marks.get(i);
//			}
//		}
//		return small;
		return Collections.min(list_of_marks);
	}
	BigDecimal get_average_marks() {
		BigDecimal get_average=new BigDecimal(get_total_sum_marks());
		return get_average.divide(new BigDecimal(list_of_marks.size()),2, RoundingMode.DOWN);
	}
	public String toString() {
		return name +" "+list_of_marks;
	}
}
