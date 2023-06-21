package OutputProcessor.DisposeDrink;

import dataStore.DS;
//This class follows the Strategy Pattern

public class DisposeDrinkVM2 extends DisposeDrink {

	@Override
	public void disposeDrink(int d) {
		if(d==3) {
			System.out.println("COFFEE is disposed");
		}
	}

}
