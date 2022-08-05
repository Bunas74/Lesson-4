package by.epam.tr.lesson4;

import java.util.*;

public class Solution15 {
    
    public static void main(String[] args) {
        
        /* 15 . Дана последовательность действительных чисел. Указать те ее элементы, которые принадлежат отрезку [с, d]. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[30];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(300);
            
        }
        
        Arrays.sort(ar);
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        int c = rand.nextInt(100);
        
        int d = rand.nextInt(300);
        
        
        System.out.print("Numbers on the line [" + c + ", " + d + "]: ");
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > c && ar[i] < d || ar[i] > d && ar[i] < c) {
            	
                System.out.print(ar[i] + " ");
                
            }
            
        }

    }
    
}