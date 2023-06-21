package OutputProcessor.StorePrice;

import dataStore.DS;
//This class follows the Strategy Pattern

public class StorePriceVM1 extends StorePrice {

	@Override
	public void storePrice() {
		this.ds.setPrice(this.ds.getTempP());
		System.out.println("Stored Price complete");
	}

}
