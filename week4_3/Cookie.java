package week4_3;

public class Cookie extends DessertItem{

	
	public int number;
	public int pricePerDozen;
	public int cost;
	
	public Cookie(String name, int number, int pricePerDozen) {
	
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	@Override
	public int getCost() {
		
		double cents =  number * pricePerDozen / 12 ;
		cost = (int) Math.round(cents);
		//System.out.println("cookie cost :" +cost);
		return cost;
	}
	

}
