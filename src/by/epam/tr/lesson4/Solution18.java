package by.epam.tr.lesson4;

import java.util.*;

public class Solution18 {
    
    public static void main(String[] args) {
        
        /* 18 *. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек,
           в которые надо вставить игральные кубики. Но дверь открывается только в том случае, 
           когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
           (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
           которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[10];
        
        for(int i = 0; i < ar.length; i++) {
            
            ar[i] = rand.nextInt(6) + 1;
            
        }
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
        	
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        
        int sum = 0;
        
        for(int i = 0; i < ar.length - 2; i++) {
            
            sum = ar[i] + ar[i + 1] + ar[i + 2];
           
            if(sum == 10) {
               
                System.out.println("Lock open.");
               
            }
           
           else {
               
               System.out.println("Lock closed.");
               
           }
           
        }

    }
    
}