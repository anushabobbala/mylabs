package com.mylabs;
class Parentclass
{
	int num=100;
}
//Child class or subclass
class Subclass extends Parentclass
{
    /* I am declaring the same variable 
     * num in child class too.
     */
    int num=110;
    void printNumber(){
 	System.out.println(num);
    }
    public static void main(String args[]){
       Subclass obj= new Subclass();
       obj.printNumber();	
    }
}