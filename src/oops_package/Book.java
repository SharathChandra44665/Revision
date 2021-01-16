package oops_package;

public class Book {
	private int id;
	private String book_name;
	private Add_review add_review;
	public Book(int id, String book_name) {
		this.id = id;
		this.book_name = book_name;
	}
	
	public String add_review( Add_review add_review) {
		this.add_review=add_review;
		return this.add_review.toString();
	
	}
	public String toString() {
		
		return String.format("id: %d, name: %s, review: %s", id,book_name,add_review.toString());
	}

}
