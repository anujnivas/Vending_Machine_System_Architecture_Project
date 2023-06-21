package states;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
//This class follows the State Pattern
//This class is used to represent abstract State

public abstract class State {

	MDAEFSM mdaefsm;
	OutputProcessor outputProcessor;
	
	public MDAEFSM getMDAEFSM() {
		return mdaefsm;
	}
	
	public OutputProcessor getOutputProcessor() {
		return outputProcessor;
	}
	
	public void setMDAEFSM( MDAEFSM mdaefsm) {
		this.mdaefsm= mdaefsm;
	}
	
	public void setOutputProcessor(OutputProcessor outputProcessor) {
		this.outputProcessor=outputProcessor;
	}
	
	public abstract void create();
	public abstract void insert_cups(int n);
	public abstract void coin(int f);
	public abstract void card();
	public abstract void cancel();
	public abstract void set_price();
	public abstract void dispose_drink(int d);
	public abstract void additive( int a);
	
}
