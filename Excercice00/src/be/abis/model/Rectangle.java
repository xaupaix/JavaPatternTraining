package be.abis.model;

public class Rectangle extends Shape {

	private Double height;
	private Double width;
	private String color;

	public Rectangle(Double height,Double width,String color){
		this.height=height;
		this.width=width;
		this.color=color;
	}

	@Override
	public double area() {
		return getHeight()*getWidth();
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
}
