package com.Arrays;

import java.lang.reflect.Array;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		
	//	Syntax     dataType arrayName[]=new dataType[size];
		
		int array1[]=new int[2];
		
		array1[0]=20;
		array1[1]=30;
		
		System.out.println(array1[0]);
        System.out.println(array1[1]);		
	
		
     for(int arrayIndex=0;arrayIndex<array1.length;arrayIndex++)
     {
    	 System.out.println(array1[arrayIndex]);
     }
		
		
		
	//	syntax    dataType arrayname[]=new arrayname[size];
     
     int array2[]=new int[2];
     
     array1[0]=10;
     array1[1]=20;
     
	}

     
    /* System.out.println(array1[0]);
     System.out.println(array1[1]);
     System.out.println(array1[3]);   
     */
     
    /* for(int index=0;index<array1.length;index++)
     {
    	 System.out.println(array1[index]);
     }*/
     
     
     
    String array2[]=new String[2];
    {
    
    array2[0]="Thasleem";
    array2[1]="Parveen";
    
    for(int index=0;index<array2.length;index++)
    {
    	System.out.println(array2[index]);
    }
   
     
  String array3[]=new String[4];
		
		array3[0]="Thasleem";
		array3[1]="Parveen";
		array3[2]="Usman";
		array3[3]="Rameeja";
		
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		
		for(int arrayIndex=0;arrayIndex<array3.length;arrayIndex++)
		{
			System.out.println(array3[arrayIndex]);
		}
    }
}
		
		
		
		
		
		
		
		

	


