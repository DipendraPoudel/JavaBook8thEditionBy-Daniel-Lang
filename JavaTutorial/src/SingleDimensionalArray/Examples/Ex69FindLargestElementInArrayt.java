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
public class Ex69FindLargestElementInArrayt 
{
    
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
            
            max(nums);
            
        
        }
        
        System.out.println("The largest element in the array of integers is: "+ max(nums));
 
    
    }
    
    public static double max(double []array)
    {
        double max = array[0];
       
        for(int i =0; i < array.length;i++)
        {
            if(array [i] > max){
                max= array[i];
            }
         
        
        }
        
        
        
        
        return max;
    
    
    
    
    
    }
    
    
}
