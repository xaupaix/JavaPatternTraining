package be.abis.client;

import java.util.ArrayList;
import java.util.List;

import be.abis.model.*;

public class Client {

	private static ArrayList<Shape> shapes= new ArrayList<>();

	public static void main (String[] args){
		getShapes().add(new Rectangle("red",10.0,10.0));
		getShapes().add(new Circle("blue",10));
		giveInforForShapes();

	}

	public static ArrayList<Shape> getShapes(){
		return shapes;
	}

	public static void giveInforForShapes(){
		shapes.stream().forEach(shape -> {
			System.out.println(shape.getColor());
			System.out.println(shape.area());
		});
	}

}
