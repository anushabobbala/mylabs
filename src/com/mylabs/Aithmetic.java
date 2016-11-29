package com.mylabs;
import java.util.Scanner;

public class Aithmetic {
	public static void main(String[] args)
	{
		int a,b;
		int resulta,results,resultm;
		float resultd;
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a");
	a=sc.nextInt();
	
	System.out.println("enter value of b");
	b=sc.nextInt();
	
	resulta = a+b;
	results = a-b;
	resultm = a*b;
	resultd = (float)a/b;
	System.out.println(resulta);
	System.out.println(results);
	System.out.println(resultm);
	System.out.println(resultd);
	
	
	
	
	
	}

}
