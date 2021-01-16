package oops_package;

public class Employee_runner {
	public static void main(String[] args) {
		Employee e1=new Employee("mr", "Apple", "abc", 520322);
		e1.setEmail("someone@gmail.com");
		e1.setName("Awesome");
		e1.setPhone_number(987897892);
		System.out.println(e1);
	}
}
