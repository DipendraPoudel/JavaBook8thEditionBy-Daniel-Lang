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
public class AnalyzeNumbers {
    public static void main(String args[]){
    final int NUMBER_OF_ELEMENTS = 100;
    // declare array
    
    double [] numbers = new double [NUMBER_OF_ELEMENTS];
    double sum =0;
    
    Scanner input = new Scanner (System.in);
    
    for(int i = 0; i<NUMBER_OF_ELEMENTS; i++){
        System.out.print("Enter a  new number:");
    // store number in array
        numbers[i] = input.nextDouble();
        sum += numbers[i];
    }
        
    
    
       double average = sum/ NUMBER_OF_ELEMENTS;
    
       int count = 0; // the number of elements above average
       
       for(int i = 0; i <NUMBER_OF_ELEMENTS; i++){
           
           if(numbers[i]> average)
               count++;
           
           
       
       }
    
    
        System.out.println("Average is" + average);
        System.out.println("Number of elements above the average" + count);
    
    
    
    
    }
    
    
    
}
