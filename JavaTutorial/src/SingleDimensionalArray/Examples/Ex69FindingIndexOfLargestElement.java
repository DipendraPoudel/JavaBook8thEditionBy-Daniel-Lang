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
public class Ex69FindingIndexOfLargestElement {
    
 public static void main(String []args)
    {
        Scanner input =  new Scanner(System.in);
        double [] nums = new double[10];
        System.out.println("Enter the ten numbers:");
        // assign different numbers user enters to nums array 
        
        for(int i = 0; i< nums.length; i++)
        {
            double number = input.nextDouble();
            nums[i] = number;
            
            indexOfLargestelement(nums);
            
            
            
        
        }
        System.out.println("The index  of largest element is "+ indexOfLargestelement(nums));
    }
 
       /*** public static int indexOfLargestElement(double [] array)
        {
            double max = 0;
            int indexOfmax = 0;
            
            for(int i = 0; i < array.length; i++)
            {
                if(array[i]>max)
                {
                    max = array[i];
                    indexOfmax = i;
                
                }
                
                
            }
            return indexOfmax;
            
        }
**/
        
    /**
     * public static int indexOfLargestElement(double [] array)
        {
            double max = 0;
            int indexOfmax = 0;
            
            for(int i = 0; i < array.length; i++)
            {
                if(array[i]>max)
                {
                    max = array[i];
                    indexOfmax = i;
                
                }
                
                
            }
            return indexOfmax;
            
        }
     * @param array
     * @return 
     */
    public static int indexOfLargestelement(double []array)
                
                
        {   int indexOfMax =0;
            double max = array[0];
            for(double i : array){
                if(array[(int)(i)] > max)
                {
                
                max = array[(int)i];
                indexOfMax =(int) i;
            
            }
            }
            
            
        return indexOfMax;
        }
}
