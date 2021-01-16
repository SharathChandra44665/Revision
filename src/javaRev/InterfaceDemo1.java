package javaRev;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s1=new Solution();
		s1.calculate(10, 1);
	}

}

interface IDemo1{
	void calculate(int a ,int b);
}
class Solution implements IDemo1{
	public void calculate(int a,int b) {
		System.out.println(a+b);
	}
}