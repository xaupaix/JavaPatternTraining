package be.abis.shape;

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
	public Double area() {
		return 2*(height+width);
	}

	@Override
	public String getColor() {
		return color;
	}

}
