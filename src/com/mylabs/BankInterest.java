package com.mylabs;
import java.util.*;
public class BankInterest {
	float amountdeposit,interest_rate,tax,tax_amount,interest_earned;
	public void interestcalculation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount deposited");
		amountdeposit=sc.nextFloat();
		System.out.println("enter interest_rate");
		interest_rate=sc.nextFloat();
		
		interest_earned=((amountdeposit)*interest_rate/100);
		System.out.println("enter tax");
		tax=sc.nextFloat();
		tax_amount=interest_earned*(tax/100);
		interest_earned-=tax_amount;
		System.out.println("total interest earned="+interest_earned);
		
	}
	public static void main(String[] args){
		BankInterest bi = new BankInterest();
		bi.interestcalculation();
	}
	

}
