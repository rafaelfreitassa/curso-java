package entities;

import exceptions.BusinessException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance, withDrawLimit;
	
	public Account() {
	}
	
	public Account(int number, String holder, double balance, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithDraw(amount);
		balance -= amount;
	}
	
	private void validateWithDraw(double amount) {
		if (amount > getWithDrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");		
		}
		else if (amount > getBalance()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
		
	}

}
