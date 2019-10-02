package Dessert;

public class Sundae extends IceCream {
	int cost;
	
	Sundae(String iceCreamName, int iceCreamCost, String toppingName, int toppingCost){
		this.name = toppingName + " Sundae with " + iceCreamName;
		this.cost = iceCreamCost + toppingCost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
