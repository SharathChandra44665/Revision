package oops_package;

public class Employee extends Person{
	private String title;
	private String employer;
	private String employee_grade;
	private long salary;
	
	Employee(String title, String employer, String employee_grade, long salary){
		this.title=title;
		this.employee_grade=employee_grade;
		this.employer=employer;
		this.salary=salary;
		
	}
	
	public String toString() {
		
		return String.format("name: %s, phone no: %d email: %s \ntitle: %s, employer: %s, employee grade: %s, salary: %d", 
				super.getName(),super.getPhone_number(),super.getEmail(),title,employer,employee_grade, salary);
	}

}
