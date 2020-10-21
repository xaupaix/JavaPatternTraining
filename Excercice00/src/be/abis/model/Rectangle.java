package be.abis.model;

public class Rectangle extends Shape {

	private Double height;
	private Double width;

	public Rectangle(Double height,Double width){
		this.height=height;
		this.width=width;
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
