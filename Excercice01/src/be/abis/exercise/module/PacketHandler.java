package be.abis.exercise.module;

public abstract class PacketHandler extends Node{

	public PacketHandler(String address) {
		super(address);
	}

	public void receive(Packet packet)
	{
		super.toPrint();
		if(packet.getDestinationAddress().equals(getAddress()))
		{
			process(packet);
		}
		else
		{
			super.send(packet);
		}
	}

	public void toPrint()
	{
		System.out.println(getClass().getSimpleName() + " " + getAddress() +" received the packet" );
	}

	public abstract void process(Packet packet);

}
