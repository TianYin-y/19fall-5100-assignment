package week4_3;

public class Sundae extends IceCream{

	public int cost;
	public String topping;
	public int costOfTopping;

	
	public Sundae(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	public Sundae(String name, int cost, String topping, int costOfTopping) {
		this.name = name;
		this.cost = cost;
		this.topping = topping;
		this.costOfTopping = costOfTopping;
	}
	@Override
	public int getCost() {
		int result = cost + costOfTopping;
		System.out.println("sundae cost :" +result);
		return result;
	}
}
