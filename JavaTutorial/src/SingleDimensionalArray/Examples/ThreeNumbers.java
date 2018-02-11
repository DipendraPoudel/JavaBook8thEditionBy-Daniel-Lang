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
public class ThreeNumbers {
    
    
    
    
 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner
		int[] numbers = new int[7]; // Create an array of length ten

		// Prompt the user to enter 10 integers
		System.out.print("Enter 7 numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		// Display all combinations
		printCombinations(numbers);
	}

	/** printCombinations displays all combinations  
	*   of picking two numbers from the array
     * @param numbers */
	public static void printCombinations(int[] numbers) {
               int counter =0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				
                                
                                for(int k =0; k<numbers.length; k++){
                                    if(i != j && j != k){
                                        
                                        counter++;
                                        
                                        System.out.println(numbers[i]+ " " + numbers[j]+" "+ numbers[k]);
                                        
                                }
                                }
                                
                                
			}
		}
                
                System.out.println("The number of combinations is:" + counter);
	}}

