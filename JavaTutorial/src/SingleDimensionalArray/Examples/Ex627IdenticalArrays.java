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
public class Ex627IdenticalArrays {
    
    public static void main(String [] args)
    {
       Scanner input  = new Scanner (System.in);
       
       System.out.print("Enter the first list1:");
       int size1 = input.nextInt();
       int[] list1 = new int[size1];
       
       // loop through until the user inputs the number of total number of elements and store it to array list1
       
       for(int i = 0; i < list1.length; i++)
       {
        list1[i] = input.nextInt();
       }
       
       System.out.print("Enter the first list2:");
       int size2 = input.nextInt();
       int[] list2 = new int[size2];
       
          
       for(int i = 0; i < list2.length; i++)
       {
        list2[i] = input.nextInt();
       }
       
        input.close();
        
       boolean isEqual = equal(list1, list2);
       
       if(isEqual)
       {
           System.out.println("They are identical");
       }
       else
       {
           System.out.println("They are not identical");
       
       }
       
    }
    
    
    public static boolean equal(int [] list1, int [] list2)
 
    {
        
        Arrays.sort(list1);
        Arrays.sort(list2);
        
        if(list1.length != list2.length)
            return false;
        
        /*calling arrays.sort method in order to sort the arrays before comparing*/
        
 
        
        for(int i = 0; i < list2.length; i++)
        {   
            if(list1[i] !=  list2[i])
         
                return false;
        
        }
        
        return true;
  
    
    }
}
