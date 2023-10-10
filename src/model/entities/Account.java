package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws Exception {
		if (amount > withdrawLimit && amount > balance) {
			throw new Exception("The amount exceeds withdraw limit and the account's balance. (A quantia atingiu o limite de saque e o saldo da conta).");
		}
		if (amount > withdrawLimit) {
			throw new Exception("The amount exceeds withdraw limit. (A quantia atingiu o limite de saque).");
		}
		if (amount > balance) {
			throw new Exception("Not enough balance. (Sem saldo suficiente).");
		}
		balance -= amount;
	}

	public String toString() {
		return "Account data:\nNumber: " + number + ", Holder: " + getHolder() + ", Balance: "
				+ String.format("%.2f", balance) + ".";
	}

}
