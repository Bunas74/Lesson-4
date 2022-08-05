package by.epam.tr.lesson4;

import java.util.*;

public class Solution19 {
    
    public static void main(String[] args) {
        
        /* 19 . В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них. */
        
        Random rand = new Random();
        
        
        int[] ar = new int[20];
        
        for(int i = 0; i < ar.length; i++) {
            
            ar[i] = rand.nextInt(100);
            
        }
        
        Arrays.sort(ar);
        
        
        System.out.print("Received array: ");
        
        for(int argument: ar) {
            
            System.out.print(argument + " ");
            
        }
        
        System.out.println();
        
        
        int first = 0;
        
        int second =0;
        
        int third = 0;
        
        int fourth = 0;
        
        int countFirst = 0;
        
        int countSecond = 0;
        
        int countThird = 0;
        
        int countFourth = 0;
        
        int min = 0;
        
        
        
        for(int i = 0; i < ar.length - 1; i++) {
            
            for(int j = i + 1; j < ar.length; j++) {
                
                if(ar[i] == ar[j]) {
                    
                    first = ar[i];
                    
                    countFirst++;
                   
                }
                
            }
            
        }
        
        for(int i = 0; i < ar.length - 1; i++) {
            
            for(int j = i + 1; j < ar.length; j++) {
                
                if(ar[i] == ar[j] && ar[i] != first) {
                    
                    second = ar[i];
                    
                    countSecond++;
                   
                }
                
            }
            
        }
        
        for(int i = 0; i < ar.length - 1; i++) {
            
            for(int j = i + 1; j < ar.length; j++) {
                
                if(ar[i] == ar[j] && ar[i] != first && ar[i] != second) {
                    
                    third = ar[i];
                    
                    countThird++;
                   
                }
                
            }
            
        }
        
        for(int i = 0; i < ar.length - 1; i++) {
            
            for(int j = i + 1; j < ar.length; j++) {
                
                if(ar[i] == ar[j] && ar[i] != first && ar[i] != second && ar[i] != third) {
                    
                    fourth = ar[i];
                    
                    countFourth++;
                   
                }
                
            }
            
        }
        
        
        
        if(countFourth > 0) {
            
            System.out.println("Found four matches. Numbers: " + fourth + ", " + third + ", " + second + ", " + first);
            
            int[] arFourth = {first, second, third, fourth};
            
            min = arFourth[0];
            
            for(int i = 0; i < arFourth.length; i++) {
                
                if(arFourth[i] < min) {
                    
                    min = arFourth[i];
                }
                
            }
            
            System.out.println("The smallest of four is: " +  min);
            
        }
        
        else if(countThird > 0 && countFourth == 0) {
            
            System.out.println("Found three matches. Numbers: " + third + ", " + second + ", " + first);
            
            int[] arThird = {first, second, third};
            
            min = arThird[0];
            
            for(int i = 0; i < arThird.length; i++) {
                
                if(arThird[i] < min) {
                    
                    min = arThird[i];
                }
                
            }
            
            System.out.println("The smallest of three is: " +  min);
            
        }
        
        else if(countSecond > 0 && countThird == 0 && countFourth == 0) {
            
            System.out.println("Found two matches. Numbers: " + second + ", " + first);
            
            if(second > first) {
                
                min = first;
            }
            
            else {
                
                min = second;
                
            }
            
            System.out.println("The smallest of two is: " +  min);
            
        }
        
        else if(countFirst > 0 && countSecond == 0 && countThird == 0 && countFourth == 0) {
            
            System.out.println("One match found. Number: " + first);
            
        }
        
        else if(countFirst == 0) {
            
            System.out.println("No matches found.");
        }
       
    }
    
}