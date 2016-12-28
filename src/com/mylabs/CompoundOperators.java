package com.mylabs;
import java.util.*;
public class CompoundOperators {
	float a;
	float b;
	
	public  void caliculate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a");
		a=sc.nextFloat();
		System.out.println("a value before adding"+a);
		System.out.println("enter value of b");
		b=sc.nextFloat();
		a=a+b;
		System.out.println("a value after adding"+a);
	}
		
		public static void main(String[] args){
			CompoundOperators obj = new CompoundOperators();
			obj.caliculate();
			
			
			
		
			
		}
		
				
	}

