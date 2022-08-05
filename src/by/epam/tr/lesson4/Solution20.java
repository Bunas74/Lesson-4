package by.epam.tr.lesson4;

import java.util.*;

public class Solution20 {
    
    public static void main(String[] args) {
        
        /* 20 . Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.  */
        
        Random rand = new Random();
        
        
        int[] ar = new int[30];
        
        for(int i = 0; i < ar.length; i++) {
            
            ar[i] = rand.nextInt(300);
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        for(int i = 0; i < ar.length; i++) {
            
            if(i % 2 != 0) {
                
                ar[i] = 0;
            }
        }
        
        System.out.print("Modified array: ");
        
        for(int argument: ar) {
            
            System.out.print(argument + " ");
        }

    }
    
}