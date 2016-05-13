package taxfactory;

public class TaxFactory {
	
	public TaxCalculation getTaxCalcutation(String commodityType){
	      if(commodityType == null){
	         return null;
	      }		
	      if(commodityType.equalsIgnoreCase("Luxury")){
	         return new LuxuryCommodityTax();
	         
	      } else if(commodityType.equalsIgnoreCase("Basic")){
	         return new BasicCommodityTax();
	         
	      } 
	      
	      return null;
	   }

}
