package by.epam.tr.lesson4;

import java.util.*;

public class Solution1 {
    
    public static void main(String[] args) {
        
        /*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. */
        
        try(Scanner sc = new Scanner(System.in)) {
            
            int[] ar = new int[100];
            
            for(int i = 0 ; i < 100; i++) {
            	
                ar[i] = i + 1;
                
            }
            
            
            int k;
            
            System.out.println("Enter any integer from 0 to 9.");
            
            System.out.print("> k = ");
            
            while(!sc.hasNextInt()) {
            	
                sc.nextLine();
                
                System.out.println("You entered not an integer.");
                
                System.out.println("Enter any integer from 0 to 9.");
                
            System.out.print("> k = ");
            
            }
            
            k = sc.nextInt();
            
            
            int sum = 0;
            
            for(int i = 0; i < ar.length; i++) {
            	
                if(ar[i] % k == 0) {
                	
                    sum += ar[i];
                    
                }
                
            }
            
            System.out.println("Sum of numbers in the range from 1 to 100 multiples of " + k + " is: " + sum);
            
        }      
        
    }
    
}