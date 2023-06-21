package states;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
//This class follows the State Pattern
//This class is used to represent Idle State

public class Idle extends State {

	public Idle(MDAEFSM mdaefsm, OutputProcessor outputProcessor) {
		this.mdaefsm = mdaefsm;
		this.outputProcessor = outputProcessor;
	}
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert_cups(int n) {

		this.mdaefsm.setK(this.mdaefsm.getK()+n);
		System.out.println(n + " cups added. Total number of cups: " + this.mdaefsm.getK());
	}

	@Override
	public void coin(int f) {

		if( f == 0 ) {
			//InSufficient coins
			this.outputProcessor.increaseCF();
			System.out.println("Please insert more coins");

		}else if(f == 1 ) {
			//Sufficient coins
			this.outputProcessor.increaseCF();
			this.mdaefsm.setAdditiveArray(new int[] { 0 , 0});
			this.mdaefsm.setCurrentState(3);
			System.out.println("Sufficient coins. State changed to 'Coins inserted'");

		}
	}

	@Override
	public void card() {
		this.outputProcessor.zeroCF();
		this.mdaefsm.setAdditiveArray(new int[] { 0 , 0});
		this.mdaefsm.setCurrentState(3);
		System.out.println("Card Accepted. State changed to 'Coins inserted'");
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set_price() {
		this.outputProcessor.StorePrice();
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
