package be.abis.exercise.test;

import be.abis.exercise.module.FileServer;
import be.abis.exercise.module.InktJet;
import be.abis.exercise.module.LanComponent;
import be.abis.exercise.module.Laser;
import be.abis.exercise.module.MQServer;
import be.abis.exercise.module.Node;
import be.abis.exercise.module.Packet;
import be.abis.exercise.module.PrintServer;
import be.abis.exercise.module.PrinterStrategy;
import be.abis.exercise.module.WorkStation;

public class main {

	public static void main (String[] args){
		Node node1= new WorkStation("192.168.1.1");
		Node node2= new Node("192.168.1.2");
		Node node3= new PrintServer("192.168.1.3", new InktJet());
		Node node4= new Node("192.168.1.4");
		Node node5= new PrintServer("192.168.1.5", new Laser());
		Node node6= new Node("192.168.1.6");
		Node node7= new FileServer("192.168.1.7");
		Node node8= new Node("192.168.1.8");
		Node node9= new MQServer("192.168.1.9");

		node1.setNextComponent(node2);
		node2.setNextComponent(node3);
		node3.setNextComponent(node4);
		node4.setNextComponent(node5);
		node5.setNextComponent(node6);
		node6.setNextComponent(node7);
		node7.setNextComponent(node8);
		node8.setNextComponent(node9);
		node9.setNextComponent(node1);


		Packet packet1 = new Packet("Hello World by printer");
		packet1.setDestinationAddress("192.168.1.5");
		((WorkStation) node1).originate(packet1);

		Packet packet2 = new Packet("Hello World by file");
		packet2.setDestinationAddress("192.168.1.7");
		((WorkStation) node1).originate(packet2);

		Packet packet3 = new Packet("Hello World by MQ");
		packet3.setDestinationAddress("192.168.1.9");
		((WorkStation) node1).originate(packet3);


	}
}
