package com.mylabs;

public class StudentProgress {
	int number=123789;
	String name="chinni";
	
	float m1=10,m2=20,m3=50 ;
	 
	 
	public  void print()
	{
	System.out.println("enter number"+number);
	System.out.println("enter name"+name);
	System.out.println("enter socialmarks"+m1);
	System.out.println("enter matmarks"+m2);
	System.out.println("enter engmarks"+m3);
	}
	
	public  float total( )
	
	{
	return m1+m2+m3;
	}
  public  float average(float tot)
   {
	 
	return tot/3;  
   }
  public void result(float avg)
  {
	  if(avg>40){
		  System.out.println("pass");
	  }
		  else{
			  System.out.println("fail");
			  
		  
	  } 
		  
	  }
  
   public static void main(String args[])
   {
StudentProgress StudentProgress = new StudentProgress();
 StudentProgress.print();
 float tot= StudentProgress.total();
 float avg=StudentProgress.average(tot);

 System.out.println(tot);
 System.out.println(avg);
 StudentProgress.result(avg);
 
 
 
	   
			   
		 
			   }
   
}

