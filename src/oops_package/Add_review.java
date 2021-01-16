package oops_package;

public class Add_review {
	private int id;
	private int rating;
	private String review;
	public Add_review( int id, String review,int rating) {
		this.id=id;
		this.rating = rating;
		this.review = review;
	}
	
	public String toString() {
		
		return String.format("review: %s, rating: %d", review,rating);
	}
}
