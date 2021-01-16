package oops_package;


public class Flyable_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable[] flying_objects= {new Birds(), new Aeroplane()};
//		ArrayList<Flyable> fly_objects= {new Birds(), new Aeroplane()};
		for(Flyable obj: flying_objects) {
			obj.fly();
		}
	}

}
