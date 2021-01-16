package udemy_java;

public class BiNumbers {
	private int n1,n2;
	public int getN1() {
		return n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	BiNumbers(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	int add() {
		return this.n1+this.n2;
	}
	int multiply() {
		return this.n1*this.n2;
		
	}
	void doubleNumber() {
		System.out.println(2*this.n1+","+2*this.n2);
	}
	
	

}
