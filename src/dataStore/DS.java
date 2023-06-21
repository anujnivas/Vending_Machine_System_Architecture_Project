package dataStore;

public abstract class DS {

	public abstract float getTempP();
	public abstract float getTempV1();
	public abstract int getTempV2();
	public abstract float getPrice();
	public abstract float getCF1();
	public abstract int getCF2();
	public abstract void setCF(float f);
	public abstract void setCF(int f);
	public abstract void setPrice(float f);
	public abstract void setTempV(float f);
	public abstract void setTempV(int f);
	public abstract void setTempP(float f);
}
