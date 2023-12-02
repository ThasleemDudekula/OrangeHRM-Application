package com.UserDefinedMethod;

public class MethhodExample6 {

	// Global Variable
	int var1=100;
	int var2=60;
	
	public void addition()
	{
		// Local Variable
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		
		System.out.println("The value of the variable var3 after addition is:"+var3);
	}
	
	
	public void addition(int var1,int var2)
	{
		int var3;
		var3=var1+var2;
		System.out.println("The value of the var3 after addition is:"+var3);
	}
	
	public void addition(int var1,double var2)
	{
		
		double var3;
		
		var3=var1+var2;
		System.out.println("The value of the variable var3 after addition is:"+var3);
		
	}
	
	public void addition(int var1, double var2, double var3)
	{
		double var4;
		var4=var3+var2+var1;
		System.out.println("The value of the variable var3 after addition is:"+var4);
	}
	
	
	
	public static void main(String[] args) {
		
		MethhodExample6 m6=new MethhodExample6();
		
		m6.addition();
		m6.addition(100,200);
		m6.addition(123, 123.12);
		m6.addition(120, 123.12, 123.144);
		m6.addition(100, 10.12, 123.098);
		m6.subtraction();
	}
	
	public void subtraction()
	{
		int var3;
		var3=var1-var2;
		System.out.println("The value of the variable var3 after subtraction is:"+var3);
	}
	
	
	
	
	
	
	
	
}
