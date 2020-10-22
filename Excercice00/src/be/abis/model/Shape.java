package be.abis.model;

import java.util.ArrayList;

public abstract class Shape {

	private String color;
	private Point origin;

	public abstract double area();

	public Shape(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color){
		this.color=color;
	}

	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}
}
