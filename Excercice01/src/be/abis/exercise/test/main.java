package be.abis.exercise.test;


import be.abis.exercise.module.LanFacade;
import be.abis.exercise.module.PacketFactory;

public class main {

	public static void main (String[] args){

		LanFacade lanFacade=new LanFacade();
		PacketFactory packetFactory = new PacketFactory();
		lanFacade.constructLan();
		lanFacade.getFirstNode().originate(packetFactory.getPacket1());
		lanFacade.getFirstNode().originate(packetFactory.getPacket2());
		lanFacade.getFirstNode().originate(packetFactory.getPacket3());

	}
}
