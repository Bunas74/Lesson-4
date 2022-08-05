package by.epam.tr.lesson4;

import java.util.*;

public class Solution11 {
    
    public static void main(String[] args) {
        
        /* 11 . Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). */
        
        
        Random rand = new Random();
        
        
        int l = rand.nextInt(499) + 1;
        
        int m = rand.nextInt(500) + 1;
        
        
        int[] ar = new int[10000];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = i;
            
        }
        
        
        System.out.println("Numbers between 0 and 10000 whose remainder after division by " + m + " is " + l + ": ");
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] % m == l) {
            	
                System.out.print(ar[i] + " ");
                
            }
            
        }

    }
    
}