package arrays_demo;


public class StudentRunner {
	public static void main(String[] args) {
//		int[] list_of_marks = { 100, 87, 83, 98, 91 };
		Student s1 = new Student("sharath",100, 87, 83, 98, 91);
		Student s2=new Student("Himalay", 67,45,66,100);
		
		
		System.out.println("number: "+s1.get_number_of_marks());
		System.out.println("sum: "+s1.get_total_sum_marks());
		System.out.println("max: "+s1.get_max_mark());
		System.out.println("second max: "+s1.get_second_highest());
//		s1.get_second_highest();
		System.out.println("min: "+s1.get_min_mark());
		System.out.println("average: "+s1.get_average_marks());
		System.out.println(s1);
		System.out.println("-----------------------");
		
		System.out.println("number: "+s2.get_number_of_marks());
		System.out.println("sum: "+s2.get_total_sum_marks());
		System.out.println("max: "+s2.get_max_mark());
		System.out.println("min: "+s2.get_min_mark());
		System.out.println("average: "+s2.get_average_marks());
		System.out.println(s2);
	
	}
	
}
