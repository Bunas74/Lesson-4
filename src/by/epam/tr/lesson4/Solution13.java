package by.epam.tr.lesson4;

import java.util.*;

public class Solution13 {
    
    public static void main(String[] args) {
        
        /* 13 . Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[100];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(1000);
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        int m;
        
        int l;
        
        int n;
        
        int count;
        
        
        m = rand.nextInt(50) + 1;
        
        l = rand.nextInt(300);
        
        n = rand.nextInt(1000);
        
        count = 0;
        
        
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > l && ar[i] < n  || ar[i] > n && ar[i] < l) {
            	
                if(ar[i] % m == 0) {
                	
                    count++;
                    
                }
                
            }
            
        }
        
        System.out.println("The number of multiples of the number M = " + m + " and located in the interval between L = " + l + " end N = " + n + " is: " + count);

    }
    
}
    
