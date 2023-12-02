package com.UserDefinedMethod;

public class MethodExample3 {

	private void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1-var2;
		
		System.out.println("The value of the variable var3 after subtractin is:"+var3);
		
	}
	 public static void main(String[] args) {
		 MethodExample3 m3=new MethodExample3();
		 System.out.println("Subtraction method of MethodExample3 Java class");
		 m3.subtraction();
		 
		 System.out.println("Multiplication method of MethodExample3 Java class");
		 m3.multiplication();
		 
		 MethodExample2 m=new MethodExample2();
		 System.out.println("Addition method of MethodExample2 Java class");
		 m.addition();
		 
		 
		 
		 	 
	}	
	
	  protected void multiplication()
	  {
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1*var2;
		System.out.println("The value of the variable var3 after multiplication is:"+var3);
		    
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}
