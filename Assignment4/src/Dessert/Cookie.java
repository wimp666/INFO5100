package Dessert;

public class Cookie extends DessertItem {
	int num, price;
	
	Cookie(String name, int num, int price){
		this.name = name;
		this.num = num;
		this.price = price;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.num * this.price;
	}

}
