package be.abis.exercise.module;

import java.util.ArrayList;

public class Packet {

	public String destinationAdress;
	public String contents;


	public static void main (String[] args){
		WorkStation node1= new WorkStation("192.168.1.1");
		Node node2= new Node("192.168.1.2");
		PrintServer node3= new PrintServer("192.168.1.3");
		Node node4= new Node("192.168.1.4");
		PrintServer node5= new PrintServer("192.168.1.5");

		node1.setNextComponent(node2);
		node2.setNextComponent(node3);
		node3.setNextComponent(node4);
		node4.setNextComponent(node5);

		Packet packet1 = new Packet("Hello World");
		packet1.setDestinationAdress("192.168.1.5");
		node1.receive(packet1);

		Packet packet2 = new Packet("test Originate method");
		packet2.setDestinationAdress("192.168.1.5");
		node1.originate(packet2);


	}

	public Packet (String contents){
		this.contents=contents;
	}

	public String getDestinationAdress() {
		return destinationAdress;
	}

	public void setDestinationAdress(String destinationAdress) {
		this.destinationAdress = destinationAdress;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
