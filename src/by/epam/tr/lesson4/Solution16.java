package by.epam.tr.lesson4;

import java.util.*;

public class Solution16 {
    
    public static void main(String[] args) {
        
        /* 16. Даны действительные числа n a a a , , , 2 1  . Найти 
) , , , max( 1 1 2 2 2 1 + − + + + n n n n a a a a a a  . */
        
        Random rand = new Random();
        
        
        int[] ar = new int[30];
        
        for(int i = 0; i < ar.length; i++) {
            
            ar[i] = rand.nextInt(300);
            
        }
        
        Arrays.sort(ar);
        
        
        System.out.println("Received array: ");
        
        for(int argument: ar) {
            
            System.out.printf("%4d", argument );
            
        }
        
        System.out.println("\n\n");
        
        
        int min = 0;
        
        int max = ar.length - 1;
        
        
        System.out.println("Obtained values: ");
        
        for(int i = 0; i < ar.length / 2; i++) {
            
            for(int j = 0; j < ar.length; j++) {
                
                if(j == min || j == max) {
                    
                    System.out.printf("%4d", ar[j]);
                    
                }
                
                else {
                    
                    System.out.printf("%4s", "_ ");
                    
                }
                
            }
            
            System.out.println();
            
            min++;
            
            max--;
            
        }

    }
    
}