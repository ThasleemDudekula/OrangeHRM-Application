package com.Inheritance;

public class MethodExample3 extends MethodExample2{
	
	
	public void addition(int var1, int var2)
	{
		
		int var3;
	    var3=var1+var2;
		System.out.println("The addition of variable var1 and var2 is:"+var3);
		
	}

	public void division()
	{
	// Exception Handling
		
		
		int var1=20;
		int var2 =0;
		int var3;
		
		var3=var1/var2;
		
		System.out.println("The division of variable var1 and var2: "+var3);
		
	}
	
	public static void main(String[] args) {
		
		MethodExample3 thaslee=new MethodExample3();
				
		thaslee.addition();
		thaslee.division();	
		
	}

}
