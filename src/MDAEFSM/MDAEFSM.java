package MDAEFSM;

import OutputProcessor.OutputProcessor;
import states.CoinsInserted;
import states.Idle;
import states.NoCups;
import states.Start;
import states.State;

public class MDAEFSM {

	public State s;
	public State[] stateList = new State[4]; // Start, Idle, Coin Inserted and No cups
	public int k;
	public int A[] = new int[2]; // 1--> Sugar 2 --> Cream

	public MDAEFSM(OutputProcessor op) {
		this.stateList[0] = (State) new Start(this, op);
		this.stateList[1] = (State) new NoCups(this, op);
		this.stateList[2] = (State) new Idle(this, op);
		this.stateList[3] = (State) new CoinsInserted(this, op);
		s = stateList[0];
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int[] getAdditiveArray() {
		return A;
	}

	public void setAdditiveArray(int[] A) {
		this.A = A;
	}

	public State getCurrentState() {
		return s;
	}

	public void setCurrentState(int temp) {
		s = stateList[temp];
	}

	public void create() {
		this.s.create();
	}

	public void insert_cups(int n) {
		this.s.insert_cups(n);
	}

	public void coin(int f) {
		this.s.coin(f);
	}

	public void card() {
		this.s.card();
	}

	public void cancel() {
		this.s.cancel();
	}

	public void set_price() {
		this.s.set_price();
	}

	public void dispose_drink(int d) {
		this.s.dispose_drink(d);
	}

	public void additive(int a) {
		this.s.additive(a);
	}
}
