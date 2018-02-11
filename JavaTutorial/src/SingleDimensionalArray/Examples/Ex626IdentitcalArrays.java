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
public class Ex626IdentitcalArrays {
    
    public static void main(String [] args)
    {
     

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter list1:");
        
        int size1 = input.nextInt();
        int [] list1 = new int[size1];
        
        for(int i = 0; i < list1.length; i++)
        
         list1[i] = input.nextInt();
        
        
        
        System.out.println ("Enter list2:");
        int size2 = input.nextInt();
        int [] list2 = new int[size2];
        for(int i = 0; i < list2.length; i++)
        
            list2[i] = input.nextInt();
            
        
    
         boolean isEqual = equal(list1, list2);
        
         if( isEqual)
         {
          System.out.println("They are equal");
         
         }
         
         else
         {
             System.out.println("They are not equal");
         
         }
        
    }

    public static boolean  equal(int[] list1, int[] list2)
    {
        if(list1.length !=  list2.length)
            return false;
    
        for(int i = 0; i < list2.length; i++)
        {
        if(list1[i] != list2[i])
            
            return false;
        
        }
        return true;
        
            
        
    }   
}