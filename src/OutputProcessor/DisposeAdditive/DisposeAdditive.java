package OutputProcessor.DisposeAdditive;

import dataStore.DS;
//This class follows the Strategy Pattern

public abstract class DisposeAdditive {
	protected DS ds;

	public DS getDS() {
		return this.ds;
	}

	public void setDS(DS ds) {
		this.ds = ds;
	}
	
	public abstract void disposeAdditive(int A[]);
}
