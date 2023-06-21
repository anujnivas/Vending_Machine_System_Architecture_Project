package states;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
//This class follows the State Pattern
//This class is used to represent Start state

public class Start extends State {

	public Start(MDAEFSM mdaefsm, OutputProcessor outputProcessor) {
		this.mdaefsm = mdaefsm;
		this.outputProcessor = outputProcessor;
	}
	
	@Override
	public void create() {

		this.outputProcessor.StorePrice();
		this.mdaefsm.setCurrentState(1);
		this.mdaefsm.setK(0);
		System.out.println("Cups initialized to 0. Price of drink has been set. Moving to no cups state");
	}

	@Override
	public void insert_cups(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coin(int f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose_drink(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void additive(int a) {
		// TODO Auto-generated method stub
		
	}

}
