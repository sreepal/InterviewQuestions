package taxfactory;

import java.util.HashMap;

//Concrete BasicCommodityTax Class code

public class LuxuryCommodityTax  implements TaxCalculation {
	

	@Override
	public double getCost(String commondity) {
		double taxRate= 0.09;
	     /* This is how to declare HashMap */
	      HashMap<String,Integer > hmap = new HashMap<String,Integer>();

	      /*Adding elements to HashMap*/
	      hmap.put("perfume", 40);
	      hmap.put("cigarette", 20);
	      hmap.put("Cosmotics", 60);
	    
		double taxValue=hmap.get(commondity)*taxRate;
		
		double totalCost=hmap.get(commondity)+taxValue;
		//System.out.println("Luxury commodity cost with tax ::: "+totalCost);
		// TODO Auto-generated method stub
		return totalCost;
	}

}
