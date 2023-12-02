package com.Inheritance;

public class MethodExample2 extends MethodExample1{

	// extends is keyword used in inheritance
	// The current  class will acquire all the properties of extended class into the current class
	protected void multiplication()
	{
	int var1=20;
	int var2=30;
	int var3;

	var3=var1*var2;
	System.out.println(" The value of the variable var3 after multiplication is :- "+var3);
	}

	public static void main(String[] args) {
	MethodExample2 m2 = new MethodExample2();
	m2.multiplication();

	//MethodExample1 m1 = new MethodExample1();
	// m1.addition();

	m2.addition();

	}

	
	
	
	
	
	
	
}
