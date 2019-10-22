package ATM;

import java.util.Map;

public class Atm {
	int availableAmountInMachine;
	int transactionFee;
	Map<User, UserData> userData;
	
	Atm(int availableAmountInMachine, int transactionFee, Map<User, UserData> userData){
		this.userData = userData;
		this.availableAmountInMachine = availableAmountInMachine;
		this.transactionFee = transactionFee;
	}
	
	void newUser(User user, UserData data) {
		this.userData.put(user, data);
	}
	
	User getUser(String bankAccountNumber) {
		for(User i : this.userData.keySet()) {
			if(i.bankAccountNumber == bankAccountNumber)
				return i;
		}
		return null;
	}
	
	void login(String bankAccountNumber, String password) {
		UserData temp = userData.get(getUser(bankAccountNumber));
		if(temp.password.equals(password)){
			System.out.println("Welcome " + getUser(bankAccountNumber).name + " !");
			temp.isLogin = true;
		}else {
			System.out.println("Wrong bankAccountNumber or Password");
			temp.isLogin = false;
		}
	}
	
	void forgetPassword(User user, String name, int age, String phoneNumber, String newPassword) {
		if(user.name.equals(name) && user.age == age && user.phoneNumber.equals(phoneNumber)) {
			userData.get(user).changePassword(newPassword);
		}
	}
	
	int availableBalance(User user) {
		if(userData.get(user).isLogin) {
			return userData.get(user).balance;
		}else {
			System.out.println("Please login first!");
			return 0;
		}
	}
	
	void withDrawal(User user, int amount) {
		if(userData.get(user).isLogin) {
			if(amount <= availableBalance(user) + transactionFee && amount <= availableAmountInMachine) {
				userData.get(user).balance = userData.get(user).balance - amount - transactionFee;
				userData.get(user).transactions.add("withDrawal " + amount);
				System.out.println("Withdrawed " + amount + " dollars, with transactionfee " + transactionFee + " dollars.");
			}else if(amount > availableAmountInMachine){
				System.out.println("not enough money in machine!");
			}else {
				System.out.println("not enough money in your account!");
			}
		}else {
			System.out.println("Please login first!");
		}
	}
	
	void deposit(User user, int amount) {
		if(userData.get(user).isLogin) {
			userData.get(user).balance = userData.get(user).balance + amount;
			userData.get(user).transactions.add("deposit " + amount);
			this.availableAmountInMachine += amount;
			System.out.println("deposited " + amount + " dollars!");
		}else {
			System.out.println("Please login first!");
		}
	}
	
	void recentTransactions(User user) {
		int i;
		int len = userData.get(user).transactions.size();
		if(len >= 10) {
			i = 10;
		}else {
			i = len;
		}
		if(userData.get(user).isLogin) {
			while(i > 0) {
				System.out.println(userData.get(user).transactions.get(len - i));
				i--;
			}
		}else {
			System.out.println("Please login first!");
		}
	}
	
	void changePassword(User user, String newPassword) {
		if(userData.get(user).isLogin) {
			userData.get(user).changePassword(newPassword);
		}else {
			System.out.println("Please login first!");
		}
	}
	
	void exit(User user) {
		userData.get(user).isLogin = false;
	}
}
