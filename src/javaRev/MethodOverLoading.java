package javaRev;
//parent class
class DVehilce{
	public void run() {
		System.out.println("Vehilce is running");
	}
}

class DemoCar extends DVehilce{
	public void run() {
		System.out.println("Demo Car is running");
	}
}
class DemoBike extends DVehilce{
	public void run() {
		System.out.println("Demo Bike is running");
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		DemoCar car1=new DemoCar();
		DemoBike bike1=new DemoBike();
		
		car1.run();
		bike1.run();
	}

}
