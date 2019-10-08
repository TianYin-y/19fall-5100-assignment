package week4_3;


public class Candy extends DessertItem{

	public double weight;
	public int pricePerPount;
	public int cost;
	
	
	
	public Candy(String name, double weight, int pricePerPount) {
		this.name = name;
		this.pricePerPount = pricePerPount;
		this.weight = weight;
	}
	
	@Override
	public int getCost() {
		
		double cents=0;
		cents = weight * pricePerPount;
		cost = (int) Math.round(cents);
		System.out.println("candy cost :" +cost);
		return cost;
	}
	

}
