package be.abis.exercise.module;

import java.util.ArrayList;
import java.util.List;

public class SimpleLanFactory extends LanFactory {

	private ArrayList<Node> nodes=new ArrayList<>();
	private static SimpleLanFactory instance;

	@Override
	public List<Node> createNodes() {

		nodes.add(new WorkStation("192.168.1.1"));
		nodes.add(new Node("192.168.1.2"));
		nodes.add(new PrintServer("192.168.1.3", new InktJet()));
		nodes.add(new Node("192.168.1.4"));
		nodes.add(new PrintServer("192.168.1.5", new Laser()));

		return nodes;
	}

	@Override
	public SimpleLanFactory getinstance() {
		{
			if (instance == null) {
				instance = new SimpleLanFactory();
			}
			return instance;
		}
	}
}
