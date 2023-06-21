package OutputProcessor.ZeroCF;
//This class follows the Strategy Pattern

public class ZeroCFVM2 extends ZeroCF {

	@Override
	public void zeroCF() {
		this.ds.setCF(0);
		System.out.println("CF set to 0");
	}
}
