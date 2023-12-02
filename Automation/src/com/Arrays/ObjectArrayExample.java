package com.Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
		
		Object array1[]=new Object[4];
		
		array1[0]=10;
		array1[1]="Testing";
		array1[2]='B';
		array1[3]=10.12;
		/*System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		*/
		
		
		
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		
		
		
		
		

	}

}
