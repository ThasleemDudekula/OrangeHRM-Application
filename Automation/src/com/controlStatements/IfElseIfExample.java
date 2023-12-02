package com.controlStatements;

public class IfElseIfExample 
{

	public static void main(String[] args) 
	{
		int var1=30;
	    int var2=40;
	    int var3=50;
	    
	    if(var1>var2&&var1>var3)
	    
	    {
	    	System.out.println(" var1 variable value is greater than var2 and var3 variable values ");
	    	
	    }

	    else {
	    	if(var2>var3)
	    	{
	    		
	    		System.out.println(" var2 variable value is greater than var3 and var1 variable values ");
	    	}
	    	else
	    	{
	    		System.out.println(" var3 variable value is greater than var2 and var1 variable values ");
	    	}
	    
	    
	    }
	}
}


