package OutputProcessor.IncreaseCF;

import dataStore.DS;
//This class follows the Strategy Pattern

public abstract class IncreaseCF {
	protected DS ds;
	
	public DS getDS() {
		return this.ds;
	}

	public void setDS(DS ds) {
		this.ds = ds;
	}
	
	public abstract void increaseCF();
}
