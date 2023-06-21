package OutputProcessor.DisposeDrink;

import OutputProcessor.DisposeAdditive.DisposeAdditive;
import dataStore.DS;
//This class follows the Strategy Pattern

public class DisposeDrinkVM1 extends DisposeDrink {

	@Override
	public void disposeDrink(int d) {
		if(d==1) {
			System.out.println("TEA is disposed");
		}
		if(d==2) {
			System.out.println("LATTE is disposed");
		}
	}
}
