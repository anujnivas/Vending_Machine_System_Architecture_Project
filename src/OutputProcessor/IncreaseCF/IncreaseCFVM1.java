package OutputProcessor.IncreaseCF;

import OutputProcessor.DisposeDrink.DisposeDrink;
import dataStore.DS;
//This class follows the Strategy Pattern

public class IncreaseCFVM1 extends IncreaseCF {

	@Override
	public void increaseCF() {

		this.ds.setCF(this.ds.getCF1()+this.ds.getTempV1());
		
		System.out.println("CF value: " + this.ds.getCF1());
	}
}
