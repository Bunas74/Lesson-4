package by.epam.tr.lesson4;

import java.util.*;

public class Solution5 {
    
    public static void main(String[] args) {
        
        /* 5. Дана последовательность натуральных чисел а1 , а2 ,..., аn. Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте. */
        
        Random rand = new Random();
        
        int[] ar = new int[20];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(1000);
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        int countEven = 0;
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] % 2 == 0) {
            	
                countEven++;
                
            }
            
        }
        
        
        if(countEven == 0) {
        	
                System.out.println("There are no even numbers in the array.");
                
        }
        
        else if(countEven > 0) {
        	
            int[] arEven = new int[countEven];
            
            int j = 0;
            
            for(int i = 0; i < ar.length; i++) {
            	
                if(ar[i] % 2 == 0) {
                	
                    arEven[j++] = ar[i];
                    
                }
                
            }
            
        
            System.out.print("Array of even numbers: ");
            
            for(int argumentEven: arEven) {
            	
                System.out.print(argumentEven + " ");
                
            }
            
        }
        
    }
    
}