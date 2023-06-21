package states;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
//This class follows the State Pattern
//This class is used to represent NO_CUPS state

public class NoCups extends State  {

	public NoCups(MDAEFSM mdaefsm, OutputProcessor outputProcessor) {
		this.mdaefsm = mdaefsm;
		this.outputProcessor = outputProcessor;
	}
	
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert_cups(int n) {
		if(n>0) {
			this.mdaefsm.setK(n);
			this.outputProcessor.zeroCF();
			this.mdaefsm.setCurrentState(2);
			System.out.println(n+" Cups inserted successful. Moving into IDLE state");
		}
	}

	@Override
	public void coin(int f) {
		this.outputProcessor.returnCoins();
		
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
