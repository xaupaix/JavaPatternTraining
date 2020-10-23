package be.abis.exercise.module;

public class PacketFactory {

	public static PacketFactory instance;

	private Packet packet1;
	private Packet packet2;
	private Packet packet3;

	public static PacketFactory getinstance() {
		if (instance == null) {
			instance = new PacketFactory();
		}
		return instance;
	}

	public PacketFactory() {

		packet1 = new Packet("Hello World by printer");
		packet1.setDestinationAddress("192.168.1.5");

		packet2 = new Packet("Hello World by file");
		packet2.setDestinationAddress("192.168.1.7");

		packet3 = new Packet("Hello World by MQ");
		packet3.setDestinationAddress("192.168.1.9");

}

	public static void setInstance(PacketFactory instance) {
		PacketFactory.instance = instance;
	}

	public Packet getPacket1() {
		return packet1;
	}

	public void setPacket1(Packet packet1) {
		this.packet1 = packet1;
	}

	public Packet getPacket2() {
		return packet2;
	}

	public void setPacket2(Packet packet2) {
		this.packet2 = packet2;
	}

	public Packet getPacket3() {
		return packet3;
	}

	public void setPacket3(Packet packet3) {
		this.packet3 = packet3;
	}
}
