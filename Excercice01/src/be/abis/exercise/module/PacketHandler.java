package be.abis.exercise.module;

public abstract class PacketHandler extends LanComponent{

	public PacketHandler(String address) {
		super(address);
	}

	@Override
	public void send(Packet packet) {
		getNextComponent().receive(packet);
	}

	@Override
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
