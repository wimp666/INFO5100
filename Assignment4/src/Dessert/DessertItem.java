package Dessert;

abstract class DessertItem {
	String name;
	
	public final String getName() {
		return this.name;
	}
	public abstract int getCost();

}
