package com.UserDefinedMethod;

public class MethhodExample4 {
	
	void division()
	{
		int var1=20;
		int var2=1;
		int var3;
		var3=var1/var2;
		
		System.out.println("The value of the variable var3 after division is:"+var3);
	}
	public static void main(String[] args) {
		
		MethhodExample4 m4=new MethhodExample4();
		System.out.println("Division method of MethodExample4");
	    m4.division();
	    System.out.println();
	    
	    
	    MethodExample2 m2=new MethodExample2();
	    System.out.println("Addition method of MethodExample2");
	    m2.addition();
	    System.out.println();
	    
	    MethodExample3 m3=new MethodExample3();
	    System.out.println("Multiplication method of MethodExample2");
	    m3.multiplication();
	    System.out.println();
	    
   
	}

}
