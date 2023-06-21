package dataStore;

public class DS1 extends DS{

	private float temp_p;
	private float temp_v;
	private float price;
	private float cf;
	
	@Override
	public float getTempP() {
 
		return temp_p;
	}

	@Override
	public float getTempV1() {
 
		return temp_v;
	}

	@Override
	public int getTempV2() {
 
		return 0;
	}

	@Override
	public float getPrice() {
 
		return price;
	}

	@Override
	public float getCF1() {
 
		return cf;
	}

	@Override
	public int getCF2() {
 
		return 0;
	}

	@Override
	public void setCF(float f) {
 
		this.cf = f;
	}

	@Override
	public void setCF(int f) {
 
	}

	@Override
	public void setPrice(float f) {
 
		this.price = f;
	}

	@Override
	public void setTempV(float f) {
 
		this.temp_v = f;
	}

	@Override
	public void setTempV(int f) {
		
	}

	@Override
	public void setTempP(float f) {
		this.temp_p = f;
	}

}
