package states;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
//This class follows the State Pattern
//This class is used to represent CoinInserted State

public class CoinsInserted extends State {

	public CoinsInserted(MDAEFSM mdaefsm, OutputProcessor outputProcessor) {
		this.mdaefsm = mdaefsm;
		this.outputProcessor = outputProcessor;
	}
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert_cups(int n) {
		// TODO Auto-generated method stub
		
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
		this.outputProcessor.returnCoins();
		this.outputProcessor.zeroCF();
		this.mdaefsm.setCurrentState(2);
		System.out.println("Cancelled. Moving to 'idle' state");

		
	}

	@Override
	public void set_price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose_drink(int d) {
		this.outputProcessor.disposeDrink(d);
		this.outputProcessor.disposeAdditive(this.mdaefsm.getAdditiveArray());
		if(this.mdaefsm.getK()>1) {
			this.mdaefsm.setK(this.mdaefsm.getK()-1);
			this.outputProcessor.zeroCF();
			this.mdaefsm.setCurrentState(2);
			System.out.println("Drink disposed along with additives if selected. Moving to 'idle' state");
			System.out.println("Cups left: " + this.mdaefsm.getK());
		}else {
			this.mdaefsm.setK(0);
			this.outputProcessor.zeroCF();
			this.mdaefsm.setCurrentState(1);
			System.out.println("Drink disposed along with additives if selected. Moving to 'no-cups' state");
			System.out.println("Cups left: 0");
		}
	}

	@Override
	public void additive(int a) {
		int[] temp=this.mdaefsm.getAdditiveArray();
		if(temp[a]==0) {
			temp[a]=1;
			this.mdaefsm.setAdditiveArray(temp);
			System.out.println("Additive selected.");
		}else if(temp[a]==1) {
			temp[a]=0;
			this.mdaefsm.setAdditiveArray(temp);
			System.out.println("Additive un-selected.");
		}
	}

}
