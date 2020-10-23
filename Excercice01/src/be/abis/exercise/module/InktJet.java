package be.abis.exercise.module;

public class InktJet implements PrinterStrategy{


	@Override
	public String print(){
		return "printed with Ink";
	}
}
