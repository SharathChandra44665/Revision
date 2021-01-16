package collections_learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;	

public class Student_runner {

	public static void main(String[] args) {
		List<Student> all_student=List.of(new Student(101, "sharath"),
				new Student(112, "google"),new Student(105, "sneha"),new Student(100, "dev"));
		List<Student> all_student_in_list=new ArrayList<Student>(all_student);
		Collections.sort(all_student_in_list);
		System.out.println("descending: "+all_student_in_list);
		Collections.sort(all_student_in_list, new Student_descending_order());
		System.out.println("ascending: "+all_student_in_list);
	}

}
