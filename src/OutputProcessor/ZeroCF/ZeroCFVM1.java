package OutputProcessor.ZeroCF;

import OutputProcessor.StorePrice.StorePrice;
//This class follows the Strategy Pattern

public class ZeroCFVM1 extends ZeroCF {

	@Override
	public void zeroCF() {
		this.ds.setCF(0);
		System.out.println("CF set to 0");
	}
}
