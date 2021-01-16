package oops_package;

public class Fan_runner {
	public static void main(String[] args) {
		Fan fan1=new Fan("company1", 2.43, "black");
		fan1.switch_on();
		System.out.println(fan1);
		fan1.switch_off();
		System.out.println(fan1);
	}
	
	
}
