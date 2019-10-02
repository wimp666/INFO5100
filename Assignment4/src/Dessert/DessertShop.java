package Dessert;

class DessertShop {
	double taxRate = 0.065;
	String shopName = "M & M Dessert Shoppe";
	int maxItemNameSize = 50;
	int itemWidth = 20;
	
	String cents2dollarsAndCents(Integer cents) {
		Integer dollar = cents / 100;
		Integer temp = cents - dollar * 100;
		return dollar.toString() + "." + temp.toString();
	}
}
