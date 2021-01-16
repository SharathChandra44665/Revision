package oops_package;

public class Animal_runner {
	public static void main(String[] args) {
		Animal[] animal_objects= {new Dog(), new Cat()};
		for(Animal obj: animal_objects) {
			obj.bark();
		}
	}
}
