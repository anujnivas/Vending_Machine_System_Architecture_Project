package OutputProcessor.IncreaseCF;

import dataStore.DS;
//This class follows the Strategy Pattern

public class IncreaseCFVM2 extends IncreaseCF {

	@Override
	public void increaseCF() {
		
		this.ds.setCF(this.ds.getCF2()+this.ds.getTempV2());
		System.out.println("CF value: " + this.ds.getCF2());
	}

}
