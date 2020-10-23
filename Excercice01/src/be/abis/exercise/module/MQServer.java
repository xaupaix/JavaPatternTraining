package be.abis.exercise.module;

public class MQServer extends PacketHandler{

	public MQServer(String address) {
		super(address);
	}

	public void process(Packet packet)
	{
		System.out.println("Packet is treated by " + getClass().getSimpleName() + " : " +packet.getContents());
	}
}
