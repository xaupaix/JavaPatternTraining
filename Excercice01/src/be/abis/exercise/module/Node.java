package be.abis.exercise.module;

public class Node extends LanComponent {

	public Node(String address){
		super(address);
	}

	@Override
	public void send(Packet packet) {
		getNextComponent().receive(packet);
	}

	@Override
	public void receive(Packet packet) {
		toPrint();
		send(packet);
	}

	public void toPrint()
	{
		System.out.println(getClass().getSimpleName() + " " + getAddress() +" received the packet" );
	}
}
