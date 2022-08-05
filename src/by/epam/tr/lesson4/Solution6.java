package by.epam.tr.lesson4;

import java.util.*;

public class Solution6 {
    
    public static void main(String[] args) {
        
        /* 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[15];
        
        for(int i = 0; i < ar.length; i++) {
        	
            ar[i] = rand.nextInt(1000);
            
        }
        
        
        Arrays.sort(ar);
        
        System.out.print("The resulting sequence of numbers: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        int min = ar[1] - ar[0];
        
        for(int i = 1; i < ar.length - 1; i++) {
        	
            if((ar[i + 1] - ar[i]) < min) {
            	
                min = ar[i + 1] - ar[i];
                
            }
            
        }
        
        
        System.out.println("The smallest length of the numerical axis is: " + min);
        
    }
    
}