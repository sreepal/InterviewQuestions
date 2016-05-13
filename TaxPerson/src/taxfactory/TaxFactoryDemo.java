package taxfactory;

public class TaxFactoryDemo {
	   public static void main(String[] args) {
		   TaxFactory taxFactory = new TaxFactory();
		   TaxCalculation taxCalculationBasic=taxFactory.getTaxCalcutation("Basic");
		   
		   System.out.println("Basic commodity cost with tax  ::: "+taxCalculationBasic.getCost("milk"));
		   
		   TaxCalculation taxCalculationLuxury=taxFactory.getTaxCalcutation("Luxury");
		  
		   System.out.println("Luxury commodity cost with tax ::: "+taxCalculationLuxury.getCost("perfume"));
		   
	   }

}
