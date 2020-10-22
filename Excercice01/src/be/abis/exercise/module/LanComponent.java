package be.abis.exercise.module;

public abstract class LanComponent {

	public String address;
	public LanComponent nextComponent;

	public LanComponent(String address){
		this.address=address;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = address;
	}

	public LanComponent getNextComponent() {
		return nextComponent;
	}

	public void setNextComponent(LanComponent nextComponent) {
		this.nextComponent = nextComponent;
	}

	public abstract void send(Packet packet);
	public abstract void receive(Packet packet);

}
