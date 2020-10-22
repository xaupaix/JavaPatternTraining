package be.abis.exercise.module;

import java.util.ArrayList;

public class Packet {

	public String destinationAdress;
	public String contents;

	public Packet (String contents){
		this.contents=contents;
	}

	public String getDestinationAddress() {
		return destinationAdress;
	}

	public void setDestinationAddress(String destinationAdress) {
		this.destinationAdress = destinationAdress;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
