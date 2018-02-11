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
public class Ex68AveragingArray {
    public static void main (String []args){
     
        try (Scanner input = new Scanner(System.in)) {
            double[] numbers = new double[10];
            
            System.out.print("Please enter the 10 double values:");
            for(int i =0; i <numbers.length; i++){
                // assign numbers to numbers array
                numbers[i] = input.nextInt();
                
            }
            System.out.println("The average for given values is "+ average(numbers));
        }
    
    }
    
    public static int average (int [] array){
        int sum = 0;
        
        for(int number:array)
        
        {
         sum +=number; 
        
         
        
        }
        return sum/array.length;
    
    
    }
    public static double average(double []array){
        double sum =0;
        for(double number:array){
            sum +=number;
        
  
    
    }
        return sum/array.length;
    }
          
        
    
    
}
