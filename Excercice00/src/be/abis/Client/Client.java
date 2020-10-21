package be.abis.Client;

import be.abis.shape.*;

public class Client {

	private Shape myShape;

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
