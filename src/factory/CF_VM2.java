package factory;

import OutputProcessor.DisposeAdditive.DisposeAdditive;
import OutputProcessor.DisposeAdditive.DisposeAdditiveVM2;
import OutputProcessor.DisposeDrink.DisposeDrink;
import OutputProcessor.DisposeDrink.DisposeDrinkVM2;
import OutputProcessor.IncreaseCF.IncreaseCF;
import OutputProcessor.IncreaseCF.IncreaseCFVM2;
import OutputProcessor.ReturnCoins.ReturnCoins;
import OutputProcessor.ReturnCoins.ReturnCoinsVM2;
import OutputProcessor.StorePrice.StorePrice;
import OutputProcessor.StorePrice.StorePriceVM2;
import OutputProcessor.ZeroCF.ZeroCF;
import OutputProcessor.ZeroCF.ZeroCFVM2;
import dataStore.DS;
import dataStore.DS2;

//This class follows the Abstract Factory Pattern
public class CF_VM2 extends AbstractFactory {

	@Override
	public DS getDataStore() {
		return (DS) new DS2();
	}

	@Override
	public StorePrice getStorePrice() {
		return (StorePrice) new StorePriceVM2();
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return (ReturnCoins) new ReturnCoinsVM2();
	}

	@Override
	public ZeroCF getZeroCF() {
		return (ZeroCF) new ZeroCFVM2();
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return (IncreaseCF) new IncreaseCFVM2();
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return (DisposeDrink) new DisposeDrinkVM2();
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return (DisposeAdditive) new DisposeAdditiveVM2();
	}

}
