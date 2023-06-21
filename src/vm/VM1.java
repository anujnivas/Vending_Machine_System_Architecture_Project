package vm;

import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;
import dataStore.DS;
import dataStore.DS1;
import factory.AbstractFactory;
import factory.CF_VM1;
//This class is used to represent VM1

public class VM1 {
	DS ds;
	MDAEFSM mda;
	
	public VM1(MDAEFSM mda, DS ds){
		this.mda = mda;
		this.ds = ds;
		
	}
	
	public void create(int p) {
		if(p<0) {
			System.out.println("Enter a value greater than 0");
			return;
		}
		this.ds.setTempP(p);
		this.mda.create();
		
	}
	
	public void coin(float v) {
		if(v<0) {
			System.out.println("Enter a value greater than 0");
			return;
		}
		this.ds.setTempV(v);
		if(this.ds.getCF1() + v >= this.ds.getPrice()) {
			this.mda.coin(1);
		}else {
			this.mda.coin(0);
		}	
	}	
	
	public void sugar() {
		this.mda.additive(0);
		
	}
	
	
	public void tea() {
		
		this.mda.dispose_drink(1);
	}
	
	public void latte() {
		this.mda.dispose_drink(2);
		
	}
	
	public void insert_cups(int n) {
		this.mda.insert_cups(n);
		
	}
	
	public void set_price(float p) {
		this.ds.setTempP(p);
		this.mda.set_price();
		
	}
	
	public void cancel() {
		
		this.mda.cancel();
	}
	
	
}
