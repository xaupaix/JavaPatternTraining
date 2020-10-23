package be.abis.exercise.module;

import java.util.ArrayList;
import java.util.List;

public abstract class LanFactory {



	public abstract LanFactory getinstance();

	public abstract List<Node> createNodes();

	public List<Node> createLan(List<Node> nodes)
	{

		for(int i=0;i<nodes.size()-1;i++)
		{
			nodes.get(i).setNextComponent(nodes.get(i+1));
		}
		nodes.get(nodes.size()-1).setNextComponent(nodes.get(0));

		return nodes;
	}

	public Node findWorkStation(List<Node> nodes, String address)
	{
		for(Node node : nodes)
		{
			if(node.getAddress().equals(address))
			{
				return node;
			}
		}

		return null;
	}

}
