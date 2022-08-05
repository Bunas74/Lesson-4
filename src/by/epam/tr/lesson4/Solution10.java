package by.epam.tr.lesson4;

import java.util.*;

public class Solution10 {
    
    public static void main(String[] args) {
        
        /* 10 . Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых а[i] > i.   */
        
        Random rand = new Random();
        
        
        int[] ar = new int[30];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(300);
            
            if(rand.nextInt(300) % 3 == 0) {
            	
                ar[i] = -ar[i];
                
            }
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        System.out.print("Numbers for which a[i] > i: ");
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > i) {
            	
                System.out.print(ar[i] + " ");
                
            }
            
        }

    }
    
}