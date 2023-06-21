package OutputProcessor.ReturnCoins;

import dataStore.DS;
//This class follows the Strategy Pattern

public class ReturnCoinsVM1 extends ReturnCoins {

	@Override
	public void returnCoins() {

		System.out.println(this.ds.getTempV1() + " coins returned");
		this.ds.setTempV(0);
	}

}
