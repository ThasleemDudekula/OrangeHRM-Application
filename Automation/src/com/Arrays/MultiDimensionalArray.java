package com.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//Syntax   dataType arrayName[][]=new dataType[][];
		
		String array1[][]=new String[2][2];
		
		array1[0][0]="Venkat sir";
		array1[0][1]="Manual Testing";
		array1[1][0]="Srini Sir";
		array1[1][1]="Automation Testing";
		
		for(int arrayRowIndex=0;arrayRowIndex<array1.length;arrayRowIndex++)
		{
			for(int arrayRowOfCellIndex=0;arrayRowOfCellIndex<array1.length;arrayRowOfCellIndex++)
			{
				System.out.print(array1[arrayRowIndex][arrayRowOfCellIndex]+"  |  ");
			}
			System.out.println();
		}
		
		
		
		String array2[][]=new String[2][2];
		
		array2[0][0]="Thasleem";
		array2[0][1]="Parveen";
		array2[1][0]="Rameeja";
		array2[1][1]="Usman";
		
		
		for(int arrayRowindex=0;arrayRowindex<array2.length;arrayRowindex++)
		{
			for(int arrayRowOfCellindex=0;arrayRowOfCellindex<array2.length;arrayRowOfCellindex++) {
			System.out.print(array2[arrayRowindex][arrayRowOfCellindex]+"  ||  ");
					
			}
			System.out.println();
		}
		
		
	}

}
