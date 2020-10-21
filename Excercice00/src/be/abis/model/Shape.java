package be.abis.model;

import java.util.ArrayList;

public abstract class Shape {

	private String color;
	private Point point;

	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color){
		this.color=color;
	}
}
