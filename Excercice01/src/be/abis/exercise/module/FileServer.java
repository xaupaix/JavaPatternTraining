package be.abis.exercise.module;

public class FileServer extends PacketHandler{

	public FileServer(String address) {
		super(address);
	}

	public void process(Packet packet)
	{
		System.out.println("Packet is treated by " + getClass().getSimpleName() + " : " +packet.getContents());
	}

}
