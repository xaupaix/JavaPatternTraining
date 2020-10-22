package be.abis.exercise.module;

public class PrintServer extends Node{

	public PrintServer(String address) {
		super(address);
	}

	@Override
	public void receive(Packet packet) {
		toPrint();
		if(packet.getDestinationAddress().equals(getAddress()))
		{
			print(packet);
		}
		else
		{
			send(packet);
		}
	}

	public void print(Packet packet)
	{
		System.out.println("Packet is printed by PrintServer : " +packet.getContents());
	}
}
