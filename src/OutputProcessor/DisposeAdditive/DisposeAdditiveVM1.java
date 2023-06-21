package OutputProcessor.DisposeAdditive;

import dataStore.DS;
//This class follows the Strategy Pattern

public class DisposeAdditiveVM1 extends DisposeAdditive {

	@Override
	public void disposeAdditive(int A[]) {
		if(A[0]==1) {
			System.out.println("Sugar additive is added");
		}
	}
}
