package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object>arrayList1=new ArrayList<>();
		
        arrayList1.add(10);
        arrayList1.add("Thasleem");
        arrayList1.add('B');
        arrayList1.add(10.123);
        
        for(int index=0;index<arrayList1.size();index++)
        {
        	System.out.println(arrayList1.get(index));
        }
		
		
		

	}

}
