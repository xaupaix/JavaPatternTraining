package be.abis.exercise.module;

public class PrintServer extends Node{

	private PrinterStrategy printerStrategy;

	public PrintServer(String address, PrinterStrategy printerStrategy) {
		super(address);
		this.printerStrategy=printerStrategy;

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
		System.out.println("Packet is printed by PrintServer (" + printerStrategy.print() + ") : " +packet.getContents());
	}
}
