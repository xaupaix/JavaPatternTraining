package be.abis.exercise.module;

public class Laser implements PrinterStrategy{

	@Override
	public String print() {
		return "printed with Laser";
	}
}
