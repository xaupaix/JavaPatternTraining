package be.abis.exercise.module;

public class PrintServer extends PacketHandler{

	private PrinterStrategy printerStrategy;

	public PrintServer(String address, PrinterStrategy printerStrategy) {
		super(address);
		this.printerStrategy=printerStrategy;
	}

	public void process(Packet packet)
	{
		System.out.println("Packet is treated by " + getClass().getSimpleName() + " (use "+printerStrategy.print()+ ") : " +packet.getContents());
	}

	public PrinterStrategy getPrinterStrategy() {
		return printerStrategy;
	}

	public void setPrinterStrategy(PrinterStrategy printerStrategy) {
		this.printerStrategy = printerStrategy;
	}
}
