package by.epam.tr.lesson4;

import java.util.*;

public class Solution12 {
    
    public static void main(String[] args) {
        
        /* 12 . Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами. */
        
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
        
        
        
        PrimeNumber pn = new PrimeNumber();
        
        
        int sum = 0;
        
        System.out.print("Prime numbers in an array: ");
        
        for(int i = 0; i < ar.length; i++) {
        	
            pn.setIsPrime(ar[i]);
            
            if(pn.getIsPrime() != 0) {
            	
            System.out.print(pn.getIsPrime() + " ");
            
            sum += pn.getIsPrime();
            
            }
                       
        }
        System.out.println();
        
        
        System.out.println("The sum of prime numbers in the array is: " + sum);

    }
    
}

class PrimeNumber {
    
        private int isPrime;
        
        private boolean checkPrime;
        
        
        public void setIsPrime(int isPrime) {
        	
            this.isPrime = isPrime;
            
        }
        
        
        public int getIsPrime(){
        	
            checkPrime = true;
            
            for(int i = 2; i < isPrime; i++) {
            	
                if(isPrime % i == 0) {
                	
                checkPrime = false;
                
                }
                
            }
            
            if(checkPrime){
            	
                return isPrime;
                
            }
            
            else {
            	
               return 0; 
               
            }
        
      }
            
}