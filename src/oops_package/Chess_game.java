package oops_package;

public class Chess_game implements Game_console{

	@Override
	public void up() {
		System.out.println("piece move forward");
	}

	@Override
	public void down() {
		System.out.println("piece move backward");
		
	}

	@Override
	public void right() {
		System.out.println("move right");
		
	}

	@Override
	public void left() {
		System.out.println("move left");
	}
	
}
