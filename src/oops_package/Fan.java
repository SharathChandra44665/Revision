package oops_package;

public class Fan {
	private String manufacturer;
	private double radius;
	private String color;
	private boolean is_on;
	private byte speed;
	
	public Fan(String manufacturer, double radius, String color) {
		super();
		this.manufacturer = manufacturer;
		this.radius = radius;
		this.color = color;
	}
	public void switch_on() {
		this.is_on=true;
		setSpeed((byte)5);
	}
	public void switch_off() {
		this.is_on=false;
		setSpeed((byte)0);
	}
	
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	public String toString() {
		return String.format("manufacturer: %s, radius: %f, color: %s, is on: %b, speed: %d", manufacturer,radius,color,is_on,speed);
	}
	
	
}
