package com.mylabs;

public class BankAccount {
	float balanceAmount;

	BankAccount() {
		balanceAmount = 10000f;

	}

	void withDraw(float amount) {
		if (amount <= balanceAmount) {

			balanceAmount = balanceAmount - amount;
		} else {
			System.out.println("balnce insufficient");
		}
	}

	void deposit(float amount) {
		balanceAmount = balanceAmount + amount;
		System.out.println("amount deposited");
	}

	float getBalance() {
		return balanceAmount;
	}

	public static void main(String[] args) {
		BankAccount venky = new BankAccount();
		BankAccount tinku = new BankAccount();
		BankAccount bittu = new BankAccount();
		venky.deposit(7000f);
		System.out.println("balnce amount =" + venky.getBalance());
		tinku.withDraw(5000f);
		System.out.println("balnce amount =" + tinku.getBalance());
		bittu.withDraw(12000);
		System.out.println("balnce amount =" + bittu.getBalance());
	}
}
