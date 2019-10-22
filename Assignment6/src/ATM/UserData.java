package ATM;

import java.util.List;
import java.util.ArrayList;

class UserData {	
	String password;
	boolean isLogin;
	int balance;
	List<String> transactions;
	
	UserData(String password){
		this.password = password;
		isLogin = false;
		balance = 0;
		transactions = new ArrayList<>();
	}
	
	void changePassword(String newPassword) {
		this.password = newPassword;
	}
}
