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
public class Ex612ReversingArray {
    
    public static void main(String []args){
        
        int [] list1 = new int[10];
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ten numbers:");
        for(int i =0 ; i < list1.length; i++)
        {
         int num = input.nextInt();
         list1[i] = num;
        
         
         
        }
        int [] list2 =reverse(list1);
         
        // toString method displays the elements of array in textual form 
        System.out.print(Arrays.toString(list2));
     
 
    
    
    
    }
    
    public static  int[] reverse(int[] array)
    {
        // create the result array and copying the elements from array array to result array in reverse order and returns the array
        int [] result = new int[array.length];
        for( int i = 0, j = result.length-1; i < array.length; i++, j--)
        {
           result[j]= array[i];
        
        }            
        
        return result;
            
     
    }
    
    public static void displayReversal(int [] array){
        for(int i =0; i < array.length; i++){
            System.out.println(array[i]+ " ");
        
        
        }
    
    }
    
    
}
