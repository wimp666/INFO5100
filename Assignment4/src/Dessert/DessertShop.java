package Dessert;

class DessertShop {
	double taxRate;
	String shopName;
	int maxItemNameSize;
	int itemWidth;
	
	String cents2dollarsAndCents(Integer cents) {
		Integer dollar = cents / 100;
		Integer temp = cents - dollar * 100;
		return dollar.toString() + "." + temp.toString();
	}
}
