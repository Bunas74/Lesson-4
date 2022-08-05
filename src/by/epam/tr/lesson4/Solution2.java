package by.epam.tr.lesson4;

import java.util.*;

public class Solution2 {
    
    public static void main(String[] args) {
        
        /*2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. */
        
        Random rand = new Random();
        
        int[] ar = new int[15];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(10);
            
        }
        
        for(int argument: ar) {
        	
            System.out.printf("[%2d]", argument);
            
        }
        
        System.out.println();
        
        
        int countZero = 0;
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] == 0) {
            	
                countZero++;
                
            }
            
        }
        
        
        int[] arZero = new int[countZero];
        
        int j = 0;
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] == 0) {
            	
                arZero[j++] = i;
                
            }
            
        }
        
        if(countZero == 0) {
        	
            System.out.println("There are no zeros in the array.");
            
        }
        
        else {
        	
        	System.out.print("Zeros have indices: ");
        	
        	for(int zero: arZero) {
        	
        		System.out.printf("{%2d}", zero);
            
        	}
        
        }
      
    }
   
}