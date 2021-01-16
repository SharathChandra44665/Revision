package javaRev;

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle= new Rectangle();
		Shape circle= new Circle();
		
		rectangle.draw();
		circle.draw();
		
		
	}

}

abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("rectangle draw");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Circle draw");
	}
}