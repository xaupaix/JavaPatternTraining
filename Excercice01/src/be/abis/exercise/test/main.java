package be.abis.exercise.test;

import be.abis.exercise.module.InktJet;
import be.abis.exercise.module.Laser;
import be.abis.exercise.module.Node;
import be.abis.exercise.module.Packet;
import be.abis.exercise.module.PrintServer;
import be.abis.exercise.module.PrinterStrategy;
import be.abis.exercise.module.WorkStation;

public class main {

	public static void main (String[] args){
		WorkStation node1= new WorkStation("192.168.1.1");
		Node node2= new Node("192.168.1.2");
		PrintServer node3= new PrintServer("192.168.1.3", new InktJet());
		Node node4= new Node("192.168.1.4");
		PrintServer node5= new PrintServer("192.168.1.5", new Laser());

		node1.setNextComponent(node2);
		node2.setNextComponent(node3);
		node3.setNextComponent(node4);
		node4.setNextComponent(node5);
		node5.setNextComponent(node1);

		Packet packet1 = new Packet("Hello World");
		packet1.setDestinationAddress("192.168.1.5");
		node1.originate(packet1);

	}
}
