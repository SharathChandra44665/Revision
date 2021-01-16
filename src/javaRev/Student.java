package javaRev;

public class Student {
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
		
	}
	public void show() {
		System.out.println("rollNo: "+rollNo+" Name: "+name);
	}

}
