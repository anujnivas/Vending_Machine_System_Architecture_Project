package factory;

import OutputProcessor.DisposeAdditive.DisposeAdditive;
import OutputProcessor.DisposeAdditive.DisposeAdditiveVM1;
import OutputProcessor.DisposeDrink.DisposeDrink;
import OutputProcessor.DisposeDrink.DisposeDrinkVM1;
import OutputProcessor.IncreaseCF.IncreaseCF;
import OutputProcessor.IncreaseCF.IncreaseCFVM1;
import OutputProcessor.ReturnCoins.ReturnCoins;
import OutputProcessor.ReturnCoins.ReturnCoinsVM1;
import OutputProcessor.StorePrice.StorePrice;
import OutputProcessor.StorePrice.StorePriceVM1;
import OutputProcessor.ZeroCF.ZeroCF;
import OutputProcessor.ZeroCF.ZeroCFVM1;
import dataStore.DS;
import dataStore.DS1;

//This class follows the Abstract Factory Pattern
public class CF_VM1 extends AbstractFactory {

	@Override
	public DS getDataStore() {
		return (DS) new DS1();
	}

	@Override
	public StorePrice getStorePrice() {
		return (StorePrice) new StorePriceVM1();
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return (ReturnCoins) new ReturnCoinsVM1();
	}

	@Override
	public ZeroCF getZeroCF() {
		return (ZeroCF) new ZeroCFVM1();
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return (IncreaseCF) new IncreaseCFVM1();
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return (DisposeDrink) new DisposeDrinkVM1();
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return (DisposeAdditive) new DisposeAdditiveVM1();
	}

}
