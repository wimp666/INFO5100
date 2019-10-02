package Dessert;

class Candy extends DessertItem {
	double pricePerPound;
	int weight;
	
	Candy(String name, double price, int weight) {
		this.name = price + " lbs. @ " +weight + " /lb. " + name;
		this.pricePerPound = price;
		this.weight = weight;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int) Math.round((this.pricePerPound * this.weight));
	}
}
