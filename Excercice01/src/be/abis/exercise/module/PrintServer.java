package be.abis.exercise.module;

public class PrintServer extends PacketHandler{

	private PrinterStrategy printerStrategy;

	public PrintServer(String address, PrinterStrategy printerStrategy) {
		super(address);
		this.printerStrategy=printerStrategy;
	}

	public void receive(Packet packet) {
		super.receive(packet);
		if(packet.getDestinationAddress().equals(getAddress()))
		{
			process(packet);
		}
		else
		{
			super.send(packet);
		}
	}

	public void process(Packet packet)
	{
		super.process(packet,"PrintServer");
		System.out.println("printed with "+ printerStrategy.print());
	}

	public PrinterStrategy getPrinterStrategy() {
		return printerStrategy;
	}

	public void setPrinterStrategy(PrinterStrategy printerStrategy) {
		this.printerStrategy = printerStrategy;
	}
}
