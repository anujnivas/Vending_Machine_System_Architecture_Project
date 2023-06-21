package factory;

import OutputProcessor.DisposeAdditive.DisposeAdditive;
import OutputProcessor.DisposeDrink.DisposeDrink;
import OutputProcessor.IncreaseCF.IncreaseCF;
import OutputProcessor.ReturnCoins.ReturnCoins;
import OutputProcessor.StorePrice.StorePrice;
import OutputProcessor.ZeroCF.ZeroCF;
import dataStore.DS;

//This class follows the Abstract Factory Pattern
public abstract class AbstractFactory {

	public abstract DS getDataStore();
	public abstract StorePrice getStorePrice();
	public abstract ReturnCoins getReturnCoins();
	public abstract ZeroCF getZeroCF();
	public abstract IncreaseCF getIncreaseCF();
	public abstract DisposeDrink getDisposeDrink();
	public abstract DisposeAdditive getDisposeAdditive();

}
