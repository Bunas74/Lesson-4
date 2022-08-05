package by.epam.tr.lesson4;

import java.util.*;

public class Solution8 {
    
    public static void main(String[] args) {
        
        /* 8 . Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. */
        
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
        
        
        
        int positive = 0;
        
        int negative = 0;
        
        int zero = 0;
        
        
        for(int i = 0; i < ar.length; i++) {
        	
            if(ar[i] > 0) {
            	
                positive++;
                
            }
            
            else if(ar[i] < 0) {
            	
                negative++;
                
            }
            
            else if(ar[i] == 0) {
            	
                zero++;
                
            }
            
        }
        
        
        System.out.println("Positive elements in the array: " + positive);
        
        System.out.println("Negative elements in an array: " + negative);
        
        System.out.println("Zero elements in an array: " + zero);

    }
    
}