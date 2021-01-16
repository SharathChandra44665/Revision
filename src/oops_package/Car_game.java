package oops_package;

public class Car_game implements Game_console{

	@Override
	public void up() {
		System.out.println("Car is Accelerating");
		
	}

	@Override
	public void down() {
		System.out.println("break is presed, car getting slow");
	}

	@Override
	public void right() {
		System.out.println("turn right");
		
	}

	@Override
	public void left() {
		System.out.println("turn left");
	}
	

}
