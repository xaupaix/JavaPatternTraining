package be.abis.model;

public class Circle extends Shape {

	private Double radius;

	public Circle(Double radius,String color){
		this.radius=radius;
	}

	@Override
	public double area() {
		return Math.PI* Math.pow(getRadius(),2);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius){
		this.radius=radius;
	}
}
