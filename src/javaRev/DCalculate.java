package javaRev;

public class DCalculate {
	
	private int i,j;
	private int m;//
	DCalculate(int i,int j){
		this.i=i;
		this.j=j;
	}
	private void add() {
		System.out.println(i+j);
	}
	public void show() {
		add();
	}
	public void showVariableJ() {
		System.out.println(j);
	}
	public void setVariableM(int m /* */) {
		this.m=m;
		
	}
	void getVariable() {
		System.out.println(m);
	}

}
