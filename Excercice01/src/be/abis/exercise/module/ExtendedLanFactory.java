package be.abis.exercise.module;

import java.util.ArrayList;
import java.util.List;

public class ExtendedLanFactory extends LanFactory{

	private ArrayList<Node> nodes=new ArrayList<>();
	private static ExtendedLanFactory instance;

	@Override
	public List<Node> createNodes() {

		nodes.add(new WorkStation("192.168.1.1"));
		nodes.add(new Node("192.168.1.2"));
		nodes.add(new PrintServer("192.168.1.3", new InktJet()));
		nodes.add(new Node("192.168.1.4"));
		nodes.add(new PrintServer("192.168.1.5", new Laser()));
		nodes.add(new Node("192.168.1.6"));
		nodes.add(new FileServer("192.168.1.7"));
		nodes.add(new Node("192.168.1.8"));
		nodes.add(new MQServer("192.168.1.9"));

		return nodes;
	}

	@Override
	public ExtendedLanFactory getinstance() {
		{
			if (instance == null) {
				instance = new ExtendedLanFactory();
			}
			return instance;
		}
	}

}
