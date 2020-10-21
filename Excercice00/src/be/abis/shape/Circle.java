package be.abis.shape;

public class Circle extends Shape {

	private Double radius;
	private String color;

	public Circle(Double radius,String color){

		this.radius=radius;
		this.color=color;
	}

	@Override
	public Double area() {
		return 2*Math.PI*getRadius();
	}

	@Override
	public String getColor() {
		return color;
	}

	public Double getRadius() {
		return radius;
	}
}
