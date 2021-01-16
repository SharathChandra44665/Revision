package collections_learn;

import java.util.Comparator;

class Student_descending_order implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}

	
		
}
public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id+" "+name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return Integer.compare( o.id,this.id);
	}
}
