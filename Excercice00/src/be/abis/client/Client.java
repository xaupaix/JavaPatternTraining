package be.abis.client;

import be.abis.model.*;

public class Client {

	private Shape myShape;

	public static void main (String[] args){
		Client client =new Client(new Rectangle(10.0,10.0,"red"));
		System.out.println(client.getMyShape().getColor());
		System.out.println(client.getMyShape().area());

	}

	public Client(Rectangle rectangle){
		this.myShape=rectangle;
	}

	public Shape getMyShape() {
		return myShape;
	}

	public void setMyShape(Shape myShape) {
		this.myShape = myShape;
	}
}
