package be.abis.exercise.module;

import java.util.ArrayList;
import java.util.List;

public class LanFacade {

	private LanFactory lanFactory;
	private List<Node> nodes;

	public LanFacade(){
		lanFactory=new ExtendedLanFactory().getinstance();
	}

	public List<Node> constructLan()
	{
		nodes =lanFactory.createNodes();
		return lanFactory.createLan(nodes);
	}

	public WorkStation getFirstNode()
	{
		if(nodes.size()>0 && nodes.get(0).getClass().equals(WorkStation.class))
		{
			return (WorkStation)nodes.get(0);
		}
		return null;
	}
	public LanFactory getLanFactory() {
		return lanFactory;
	}

	public void setLanFactory(LanFactory lanFactory) {
		this.lanFactory = lanFactory;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
}
