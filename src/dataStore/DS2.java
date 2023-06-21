package dataStore;

public class DS2 extends DS{

	private float temp_p;
	private int temp_v;
	private float price;
	private int cf;
	@Override
	public float getTempP() {
		// TODO Auto-generated method stub
		return temp_p;
	}
	@Override
	public float getTempV1() {

		return 0;
	}
	@Override
	public int getTempV2() {
		// TODO Auto-generated method stub
		return temp_v;
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public float getCF1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getCF2() {
		// TODO Auto-generated method stub
		return cf;
	}
	@Override
	public void setCF(float f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setCF(int f) {
		// TODO Auto-generated method stub
		this.cf = f;
	}
	@Override
	public void setPrice(float f) {
		// TODO Auto-generated method stub
		this.price = f;
	}
	@Override
	public void setTempV(float f) {
		// TODO Auto-generated method stub
	}
	@Override
	public void setTempV(int f) {
		// TODO Auto-generated method stub
		this.temp_v = f;
	}
	@Override
	public void setTempP(float f) {
		// TODO Auto-generated method stub
		this.temp_p = f;
	}
}
