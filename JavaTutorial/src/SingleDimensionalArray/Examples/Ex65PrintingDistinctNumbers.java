/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex65PrintingDistinctNumbers {
    
 public static void main(String[] args)
	{
		// Create and declare array
		int[] numbers = createArray();
		
		// Count the occurrences of each integer
		int[] counts = countIntegers(numbers);
		
		// Display counts
		System.out.println("The occurrences of each integer are: ");
		displayCounts(counts);
		
	} // End of main method
	
	public static int[] createArray()
	{
		// Declare an array of integers and create it
		int[] numbers = new int[10];
                int index =0;
		int num = 0;
                Scanner input = new Scanner(System.in);
                System.out.println("enter the up to 10 numbers:");
		// Create integers randomly and assign them to the array
		for(int i = 0; i < numbers.length; i++)
                        numbers[i] = input.nextInt();
                        
                             
		
		// Return the array
		return numbers;
	} // End of createArray method
	
	public static int[] countIntegers(int[] numbers)
	{
		// Declare and create an array of 10 int
		int[] counts = new int[10];
		
		// For each integer in the array, count it
		for(int i = 0; i < numbers.length ; i++)
                    		
           
                      
			counts[numbers[i]]++;
		
		return counts;
	} // End of countIntegers method
	
	public static void displayCounts(int[] counts)
	{
		for(int i = 0; i < counts.length; i++)
		{
			if((i + 1) % 10 == 0)
				System.out.println("The number "+i+ " appeared " + counts[i] + " time.");
			else
				System.out.println("The number "+ i + " appeared " + counts[i] + " times.");
		}
              
	}
        
        
        public static boolean isNew(int []numbers, int n ){
     


        for (int i : numbers){
            if (n == i) return false;
        }
        return true;

            
         
        }
        
        
        
} // End of class
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

