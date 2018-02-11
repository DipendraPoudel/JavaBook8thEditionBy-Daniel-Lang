/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex618BubbleSort {
    
    static final int SIZE = 10;
    
    
    public static void main (String [] args){
        double [] list = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 10 numbers:");
        
        for(int i =0; i < SIZE; i++)
        {
            list[i] = input.nextInt();
        
        }  
        BubbleSort(list);
        
        System.out.println("The sorted array by bubble sort would be:"+ Arrays.toString(BubbleSort(list)));
    
    }
    public static double[] BubbleSort(double [] array)
    {
        for(int i =0; i< array.length -1; i++)
        {
            for(int j =0; j<array.length-1;j++){
            
                if(array[j]>array[j+1])
                {
                double temp = array[j];     // swap code 
                array[j]= array[j+1];
                array[j+1] = temp;
                
                
                }
            
            }
        
        
        
        }
        return array;
    
        
    
        
        
    }
    
    
    
    
    
}
    
    
        



