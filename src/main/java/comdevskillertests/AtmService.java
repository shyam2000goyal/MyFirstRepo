package comdevskillertests;

import java.util.HashMap;
import java.util.Map;

public class AtmService {

	private Map<String, Integer> accounts = new HashMap<>();

	public String withdraw(String cardNumber, int amount) {
		if (amount < 0) {
			return "Amount should be greater than zero";
		}

		if (amount % 10 != 0) {
			return "Amount should be the multiple of the 10 USD";
		}

		int balance = getBalance(cardNumber);

		if (amount > balance) {
			return "Insufficient funds";
		}

		int newBalance = balance - amount;
		accounts.put(cardNumber, newBalance);
		return "Success! Amount left: " + newBalance + " USD";
	}

	public Integer getBalance(String cardNumber) {
		return accounts.getOrDefault(cardNumber, 0);
	}

	public void deposit(String cardNumber, int initialBalance) {
		accounts.put(cardNumber, initialBalance);
	}
}
