package week4_3;

public class IceCream extends DessertItem{

	public int cost;
	
	public IceCream() {
	}
	public IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	@Override
	public int getCost() {
		System.out.println("icecream cost :" +cost);
		return cost;
	}

}
