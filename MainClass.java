package pt1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		//MainClass ob=new MainClass();
		
		Set<ElectronicDevice> cSet = new TreeSet<>();
		cSet.add(new Computer(150,5,20000,101));
		cSet.add(new Computer(100,5,30000,102));
		cSet.add(new Computer(160,5,10000,103));
		cSet.add(new Computer(120,5,25000,104));
		
		doPrint(cSet,"Default Data Rendering ");
		
		List<ElectronicDevice> priceBasedList = new ArrayList<>();
		priceBasedList.addAll(cSet);
		
		Collections.sort(priceBasedList, new sortComputerBasedOnPrice());
		
		doPrint(priceBasedList," Sort Data Based on Price ");
		
	}
	
	public static void doPrint(Collection<ElectronicDevice> collection,String tagLine)
	{
		System.out.println("\n\n ============"+tagLine+"=========================\n");
		System.out.println("--Power---Price--");
		for (ElectronicDevice com : collection) {
			System.out.println(com);
		}
	}

}
