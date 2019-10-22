package ATM;

import java.util.HashMap;

class Test {

	public static void main(String[] args) {
		User userA = new User("A", 18, "100 A Road", "123000", "10000000");
		Atm atm1 = new Atm(99999999, 1, new HashMap<>());
		
		atm1.newUser(userA, new UserData("AAAAAA"));
		atm1.login("10000000", "BBBBBB");
		atm1.login("10000000", "AAAAAA");
		atm1.deposit(userA, 10000);
		System.out.println(atm1.availableBalance(userA));
		atm1.withDrawal(userA, 2000);
		System.out.println(atm1.availableBalance(userA));
		atm1.withDrawal(userA, 2000);
		System.out.println(atm1.availableBalance(userA));
		atm1.withDrawal(userA, 2000);
		System.out.println(atm1.availableBalance(userA));
		atm1.withDrawal(userA, 2000);
		System.out.println(atm1.availableBalance(userA));
		atm1.withDrawal(userA, 2000);
		System.out.println(atm1.availableBalance(userA));
		atm1.recentTransactions(userA);
	}

}
