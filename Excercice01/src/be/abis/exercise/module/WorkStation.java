package be.abis.exercise.module;

public class WorkStation extends Node{

	public WorkStation(String address) {
		super(address);
	}

	public void originate(Packet packet)
	{
		send(packet);
	}
}
