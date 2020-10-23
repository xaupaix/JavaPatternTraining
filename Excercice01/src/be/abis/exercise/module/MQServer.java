package be.abis.exercise.module;

public class MQServer extends PacketHandler{

	public MQServer(String address) {
		super(address);
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
		super.process(packet,"MqServer");
	}
}
