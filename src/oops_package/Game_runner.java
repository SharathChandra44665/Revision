package oops_package;

public class Game_runner {

	public static void main(String[] args) {
		Game_console car=new Car_game();
		car.up();
		car.down();
		car.left();
		car.right();
		System.out.println("---------------------------");
		
		Game_console chess=new Chess_game();
		chess.up();
		chess.down();
		chess.left();
		chess.right();

	}

}
