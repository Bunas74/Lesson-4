package by.epam.tr.lesson4;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] ar = {6, 3, 2, 1, 8, 7, 5, 4, 9};
		
		System.out.print("Initial array: ");
		
		for(int argument: ar) {
			
			System.out.print(argument + " ");
			
		}
		
		System.out.println();
		
		
		
		for (int i = 1; i < ar.length; i++) {
			
            int leftNum = ar[i];
            
            int j = i - 1;
            
            while(j >= 0 && leftNum < ar[j]) {
            	
                ar[j+1] = ar[j];
                
                j--;
                
            }
    
            ar[j+1] = leftNum;
        
        }
		
		System.out.print("Sorted array: ");
		
        for(int argument: ar) {
        	
        	System.out.print(argument + " ");
        	
        }	

	}

}
