package pt1;

public class ElectronicDevice implements Comparable<ElectronicDevice> {

	int power;
	int units;
	int time;
	int price;
	public ElectronicDevice() {
		super();
	}
	
	
	public ElectronicDevice(int power, int units, int time, int price) {
		super();
		this.power = power;
		this.units = units;
		this.time = time;
		this.price = price;
	}

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int compareTo(ElectronicDevice o) {
	
		return this.getPower() - o.getPower();
	}


	@Override
	public String toString() {

		return "=> "+power+" - "+price+"\n";
	}
	
	
	
	
}
