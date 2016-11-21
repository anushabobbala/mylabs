package com.mylabs;
class Chair
{
String colour;
int legs;
Chair()
{
colour="blue";
legs=4;
}
void print()
{
System.out.println(colour);
System.out.println(legs);
}
public static void main(String []args)
{
Chair c1=new Chair();
Chair c2=new Chair();
c1.print();
c2.print();
}
}
