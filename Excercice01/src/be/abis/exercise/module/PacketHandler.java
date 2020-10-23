package be.abis.exercise.module;

public abstract class PacketHandler extends Node{

	public PacketHandler(String address) {
		super(address);
	}

	public void send(Packet packet) {
		getNextComponent().receive(packet);
	}

	public void receive(Packet packet) {
		toPrint();
	}

	public void toPrint()
	{
		System.out.println(getClass().getSimpleName() + " " + getAddress() +" received the packet" );
	}

	public void process(Packet packet, String type)
	{
		System.out.println("Packet is treated by " + type + " : " +packet.getContents());
	}

}
