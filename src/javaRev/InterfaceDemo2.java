package javaRev;
interface Showable{
	void show();
}
interface Drawable{
	void draw();
}

public class InterfaceDemo2 implements Showable,Drawable {
	public void show() {
		System.out.println("Showable");
	}
	public void draw() {
		System.out.println("Drawable");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo2 idemo1=new InterfaceDemo2();
		idemo1.show();
		idemo1.draw();
	}

}
