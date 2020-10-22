package be.abis.model;

public class Rectangle extends Shape {

	private double height;
	private double width;

	public Rectangle(String color,double height,double width){
		super(color);
		this.height=height;
		this.width=width;
	}

	@Override
	public double area() {
		return getHeight()*getWidth();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
