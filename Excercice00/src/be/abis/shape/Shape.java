package be.abis.shape;

import java.util.ArrayList;

public abstract class Shape {

	private String color;
	private ArrayList<Point> points;
	public abstract Double area();
	public abstract String getColor();
}
