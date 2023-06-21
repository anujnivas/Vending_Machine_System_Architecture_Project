package OutputProcessor;

import OutputProcessor.DisposeAdditive.DisposeAdditive;
import OutputProcessor.DisposeDrink.DisposeDrink;
import OutputProcessor.IncreaseCF.IncreaseCF;
import OutputProcessor.ReturnCoins.ReturnCoins;
import OutputProcessor.StorePrice.StorePrice;
import OutputProcessor.ZeroCF.ZeroCF;
import dataStore.DS;
import factory.AbstractFactory;

//This class follows the Strategy Pattern
public class OutputProcessor {

	private DS ds;
	private AbstractFactory af;
	private StorePrice storePrice;
	private ZeroCF zeroCF;
	private IncreaseCF increaseCF;
	private ReturnCoins returnCoins;
	private DisposeDrink disposeDrink;
	private DisposeAdditive disposeAdditive;
	
	public OutputProcessor(AbstractFactory af, DS ds){
		this.af=af;
		this.ds=ds;
		this.storePrice=af.getStorePrice();
		this.zeroCF=af.getZeroCF();
		this.increaseCF=af.getIncreaseCF();
		this.returnCoins=af.getReturnCoins();
		this.disposeDrink=af.getDisposeDrink();
		this.disposeAdditive=af.getDisposeAdditive();

	}
	
	public void StorePrice() {
		this.storePrice.setDS(ds);
		this.storePrice.storePrice();
	}
	
	public void zeroCF() {
		this.zeroCF.setDS(ds);
		this.zeroCF.zeroCF();
	}
	
	public void increaseCF() {
		this.increaseCF.setDS(ds);
		this.increaseCF.increaseCF();
	}
	
	public void returnCoins() {
		this.returnCoins.setDS(ds);
		this.returnCoins.returnCoins();
	}
	
	public void disposeDrink(int d) {
		this.disposeDrink.setDS(ds);
		this.disposeDrink.disposeDrink(d);
	}
	
	public void disposeAdditive(int[] a) {
		this.disposeAdditive.setDS(ds);
		this.disposeAdditive.disposeAdditive(a);
	}
}
