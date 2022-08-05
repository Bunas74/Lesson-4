package by.epam.tr.lesson4;

import java.util.*;

public class Solution7 {
    
    public static void main(String[] args) {
        
        /* 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[20];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(200);
            
        }
        
        
        System.out.print("The resulting sequence: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        int z = rand.nextInt(200);
        
        System.out.println("The Z number is: " + z);
        
        
        int change = 0;
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > z) {
            	
                ar[i] = z;
                
                change++;
                
            }
            
        }
        
        
        System.out.print("Sequence after replacement: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }  
        
        System.out.println();
        
        
        System.out.println("Number of substitutions: " + change);
        
    }
    
}