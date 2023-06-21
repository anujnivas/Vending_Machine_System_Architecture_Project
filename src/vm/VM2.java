package vm;

import MDAEFSM.MDAEFSM;
import dataStore.DS;
import dataStore.DS2;
//This class is used to represent VM2

public class VM2 {
	DS ds;
	MDAEFSM mda;
	
	public VM2(MDAEFSM mda, DS ds){
		this.mda = mda;
		this.ds = ds;
		
	}
	
	public void create(float p) {
		if(p<0) {
			System.out.println("Enter a value greater than 0");
			return;
		}
		this.ds.setTempP(p);
		this.mda.create();
		
	}
	
	public void coin(int v) {
		if(v<0) {
			System.out.println("Enter a value greater than 0");
			return;
		}
		this.ds.setTempV(v);
		if(this.ds.getCF2() + v >= this.ds.getPrice()) {
			this.mda.coin(1);
		}else {
			this.mda.coin(0);
		}	
	}	
	
	public void sugar() {
		this.mda.additive(0);
	}
	
	public void cream() {
		this.mda.additive(1);
	}
	
	public void coffee() {
		this.mda.dispose_drink(3);
	}
	
	public void insert_cups(int n) {
		this.mda.insert_cups(n);
	}
	
	public void set_price(int p) {
		this.ds.setTempP(p);
		this.mda.set_price();
	}
	
	public void cancel() {
		this.mda.cancel();
	}
	
	public void card(int x) {
		if(x >= this.ds.getPrice()) {
			this.mda.card();
		}
	}
}
