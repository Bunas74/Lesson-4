package by.epam.tr.lesson4;

import java.util.*;

public class Solution4 {
    
    public static void main(String[] args) {
        
        /* 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. */
        
        Random rand = new Random();
        
        int choice = rand.nextInt(20);
        
        
        int[] ar = new int[10];
        
        if(choice % 2 == 0) {
        	
            for(int i = 0; i < ar.length; i++) {
            	
                ar[i] = i;
                
            }
            
        }
        
        else {
        	
             int j = ar.length - 1;
             
            for(int i = 0; i < ar.length ; i++) {
            	
                ar[i] = j;
                
                j--;
                
            }
            
        }
        
        
        int check = 0;
        
        for(int i = 0; i < ar.length - 1; i++) {
        	
            if(ar[i] < ar[i + 1]) {
            	
                check++;
                
            }
            
            else if(ar[i] > ar[i + 1]) {
            	
                check--;
                
            }
            
        }
        
        
        if(check > 0) {
        	
            System.out.print("Ascending sequence: ");
            
        }
        
        else if(check < 0) {
        	
            System.out.print("Descending sequence: ");
            
        }
        
        for(int elements: ar) {
        	
            System.out.print(elements + " ");
            
        }
        
    }
    
}