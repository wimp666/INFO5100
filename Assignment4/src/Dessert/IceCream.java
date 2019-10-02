package Dessert;

class IceCream extends DessertItem {
	int cost;
	
	IceCream(){
		
	}
	
	IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
