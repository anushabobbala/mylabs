package com.mylabs;

public class Overloading { 
	
	public int add(int a,int b)
	{ return a+b;
	
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
		
	}
	
public static void main(String args[])
{
	Overloading ob=new Overloading();
	System.out.println(ob.add(2,3,7));
}
}
