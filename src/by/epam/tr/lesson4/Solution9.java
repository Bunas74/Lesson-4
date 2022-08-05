package by.epam.tr.lesson4;

import java.util.*;

public class Solution9 {
    
    public static void main(String[] args) {
        
        /* 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.  */
        
        Random rand = new Random();
        
        
        int[] ar = new int[10];
        
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
        
        
        int max = ar[0];
        
        int indexMax = 0;
        
        int min = ar[0];
        
        int indexMin = 0;
        
        int temp = 0;
        
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > max) {
            	
                max = ar[i];
                
                indexMax = i;
                
            }
            
            else if(ar[i] < min) {
            	
                min = ar[i];
                
                indexMin = i;
                
            }
            
        }
        
        System.out.println("Maximum array element: " + max);
        
        System.out.println("Minimum array element: " + min);
        
        
        temp = ar[indexMin];
        
        ar[indexMin] = ar[indexMax];
        
        ar[indexMax] = temp;
        
        
        System.out.print("Array after permutation: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }

    }
    
}