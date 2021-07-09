package pt1;

public class Computer extends ElectronicDevice
{
	
	int cid;
	static int i=0;
	public Computer()
	{
		super();
	}
	

	public Computer(int units,int time, int price, int cid) { 
		super(units, time, price,cid); 
		this.cid = cid;
		this.price = price;
		power=time*units;
		System.out.println("Power consumed by Computer "+(++i)+" = "+power);
	}
	 
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
