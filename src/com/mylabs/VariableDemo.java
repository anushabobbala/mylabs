package com.mylabs;

class VariableDemo {

	private static int staticVariableCount = 0;

	private int localVariableCount = 0;

	private int localVariableCount2 = 0;
	
	public void incrementStaticVariable() {
		staticVariableCount++;
	}

	public void incrementLocalVariable() {
		localVariableCount++;
	}

	public static void  incrementStatic() {
		staticVariableCount++;
		System.out.println("staticVariableCount in method is =" + staticVariableCount);
	}
	
	public static void main(String args[]) {
		
		
		
		
		VariableDemo obj1 = new VariableDemo();
		VariableDemo obj2 = new VariableDemo();
		VariableDemo obj3 = new VariableDemo();
		
		
		obj1.incrementLocalVariable();
		System.out.println("Obj1: count is=" + obj1.localVariableCount);
		obj1.incrementStaticVariable();
		System.out.println("Obj1: count is=" + obj1.staticVariableCount);
		obj2.incrementLocalVariable();
		System.out.println("Obj2: count is=" + obj2.localVariableCount);
		obj2.incrementStaticVariable();
		System.out.println("Obj2: count is=" + obj2.staticVariableCount);
		obj3.incrementLocalVariable();
		System.out.println("Obj3: count is=" + obj3.localVariableCount);
		obj3.incrementStaticVariable();
		System.out.println("Obj3: count is=" + obj3.staticVariableCount);

		VariableDemo.staticVariableCount++;
		System.out.println("staticVariableCount is=" + staticVariableCount);
		
		
		VariableDemo.incrementStatic();
		
		
	}
}