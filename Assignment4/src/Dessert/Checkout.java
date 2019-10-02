package Dessert;

import java.util.Vector;

class Checkout extends DessertShop{
	int itemNum = 0;
	int cost = 0;
	int tax = 0;
	
	Vector<DessertItem> itemList = new Vector<>();
	
	void enterItem(DessertItem item){
		itemNum++;
		itemList.add(item);
		cost += item.getCost();
	}
	
	int numberOfItems() {
		return itemNum;
	}
	
    int totalCost(){
		return cost;
	}
	int totalTax() {
		tax =  (int)Math.round((cost * taxRate));
		return tax;
	}
	void clear() {
		itemNum = 0;
		cost = 0;
		tax = 0;
		itemList.clear();
	}
	
	public String repeat(String str, int num) {
		String res = "";
		while(num > 0) {
			res += str;
			num--;
		}
		return res;
	}
	
	public String toString() {
	    String str = repeat(" ", (40 - shopName.length()) / 2) + 
	    		"M & M Dessert Shoppe" + repeat(" ", (40 - shopName.length()) / 2) + 
	    		"\r" + repeat("-", 40) + "\r";
	    for (DessertItem di : itemList) {
	    		if(di.getName().length() <= itemWidth) {
	    			str += di.getName();
	    			str += repeat(" ", 40 - di.getName().length() - 3);
	    			str += di.getCost() + "\r";
	    		}else if(di.getName().indexOf(" ", itemWidth) != -1){
	    			str += di.getName().substring(0, di.getName().indexOf(" ", itemWidth)) + "\n";
	    			str += di.getName().substring(di.getName().indexOf(" ", itemWidth));
	    			str += repeat(" ", 40 - di.getName().substring(di.getName().indexOf(" ", itemWidth)).length() - 3);
	    			str += di.getCost() + "\r";
	    		}else {
	    			str += di.getName();
	    			str += repeat(" ", 40 - di.getName().length() - 3);
	    			str += di.getCost() + "\r";
	    		}
	    }
	    str += "\r" + "Tax" + repeat(" ", 33) + cents2dollarsAndCents(totalTax()) + "\r";
	    str += "Total Cost" + repeat(" ", 30 - cents2dollarsAndCents(totalCost() + totalTax()).length()) + cents2dollarsAndCents(totalCost() + totalTax()) + "\r";
	    
	    return str;
	}
}
