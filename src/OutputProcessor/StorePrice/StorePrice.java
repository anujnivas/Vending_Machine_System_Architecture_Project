package OutputProcessor.StorePrice;

import dataStore.DS;
//This class follows the Strategy Pattern

public abstract class StorePrice {
	protected DS ds;

	public DS getDS() {
		return this.ds;
	}

	public void setDS(DS ds) {
		this.ds = ds;
	}
	
	public abstract void storePrice();
}
