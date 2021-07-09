package pt1;

import java.util.Comparator;

public class sortComputerBasedOnPrice implements Comparator<ElectronicDevice>
{

	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) {
		// TODO Auto-generated method stub
		return o1.getPrice() - o2.getPrice();
	}

	

}
