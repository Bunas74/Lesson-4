package by.epam.tr.lesson4;

import java.util.*;

public class Solution17 {
    
    public static void main(String[] args) {
        
        /* 17 . Дана последовательность целых чисел n a a a , , , 2 1  . Образовать новую последовательность, выбросив из исходной те члены, которые равны ) , , , min( 2 1 n a a a  . */
        
        Random rand = new Random();
        
        
        int[] ar = new int[20];
        
        for(int i = 0; i < ar.length; i++) {
            
            ar[i] = rand.nextInt(300);
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
            
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        int min = ar[0];
        
        for(int i = 0; i < ar.length; i++) {
            
            if(ar[i] < min) {
                
                min = ar[i];
            }
                             
        }
        
        int countMin = 0;
        
        for(int i = 0; i < ar.length; i++) {
            
            if(ar[i] == min) {
                
                countMin++;
                
            }
        }
            
            
        int n = ar.length - countMin;          
            
        int[] arWithoutMin = new int[n];
                       
        int j = 0;
            
        for(int i = 0; i < ar.length; i++) {
                               
        	if(ar[i] != min) {
                                        
        		arWithoutMin[j++] = ar[i];
                    
            }
                
        }
            
        System.out.print("Array without min = " + min + ": ");
            
        for(int argument: arWithoutMin) {
                
            System.out.print(argument + " ");
                
        }
            
    }

}
    
