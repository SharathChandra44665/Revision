package oops_package;

public class Book_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book(10, "java");
		b1.add_review(new Add_review(10, "super", 4));
		System.out.println(b1);

	}

}
