package taxfactory;

import java.util.HashMap;

//Concrete BasicCommodityTax Class code

public class BasicCommodityTax  implements TaxCalculation {
	

	@Override
	public double getCost(String commondity) {
		double taxRate= 0.01;
	     /* This is how to declare HashMap */
	      HashMap<String,Integer > hmap = new HashMap<String,Integer>();

	      /*Adding elements to HashMap*/
	      hmap.put("milk", 40);
	      hmap.put("bread", 20);
	      hmap.put("water", 60);
	    
		double taxValue=hmap.get(commondity)*taxRate;
		
		double totalCost=hmap.get(commondity)+taxValue;
		//System.out.println("Basic commodity cost with tax  ::: "+totalCost);
		// TODO Auto-generated method stub
		return totalCost;
	}

}
