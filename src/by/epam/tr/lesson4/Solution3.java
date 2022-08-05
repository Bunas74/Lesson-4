package by.epam.tr.lesson4;

import java.util.*;

public class Solution3 {
    
    public static void main(String[] args) {
        
        /* 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное. */
        
        Random rand = new Random();
        
        int[] ar = new int[15];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(100);
            
            if(rand.nextInt(100) % 2 == 0) {
            	
                ar[i] = -ar[i];
                
            }
            
        }
        
        
        for(int argument: ar) {
        	
            System.out.printf("[%3d]", argument);
            
        }
        
        System.out.println("\n");
        
        
         for(int i = 0; i < ar.length; i++) {
        	 
             if(ar[i] > 0) {
            	 
                 System.out.println("A positive number occurs first.");
                 
                 break;
                 
             }
             
             else if(ar[i] < 0) {
            	 
                 System.out.println("A negative number occurs first.");
                 
                 break;
                 
             }
             
         }
         
    }
    
}