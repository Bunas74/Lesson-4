package by.epam.tr.lesson4;

import java.util.*;

public class Solution14 {
    
    public static void main(String[] args) {
        
        /* 14 . Дан одномерный массив A[N]. Найти сумму max среди четных и min среди нечетных */
        
        Random rand = new Random();
        
        
        int[] ar = new int[30];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(300);
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        int max = 0;
        
        int min = 0;
        
        int sum = 0;
        
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] % 2 == 0) {
            	
                max = ar[i];
                
            }
            
            else {
            	
                min = ar[i];
                
            }
            
        }
        
        
        for(int i = ar.length - 1; i >= 0; i--) {
        	
            if(ar[i] % 2 == 0) {
            	
                if(ar[i] > max) {
                	
                    max = ar[i];
                    
                }
                
            }
            
            else {
            	
                if(ar[i] < min) {
                	
                    min = ar[i];
                    
                }
                
            }
            
        }
        
        sum = max + min;
        
        System.out.println("The maximum number among even numbers is: " + max);
        
        System.out.println("The minimum number among the odd ones is: " + min);
        
        System.out.println("the sum of max and min is equal to: " + sum);

    }
    
}