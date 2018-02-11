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
 * [] numbers ---> is input arrays
 * r is the size of combination to print
 * [] data is temp array to store current combination 
 * start  & end is the starting and ending indices in [] numbers array
 */

public class Ex628CombinationofSevenIntegers {
    
    static final int N =7;
    
     public static void main(String[] args) {
       
         int[] numbers = new int[N];     /*input array*/
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <  N; i++)
        {
            numbers [i] = input.nextInt();
            
            
        }
     
        
     }
     

     /*k is the combination of set of elements in array*/
     
     static void combination(int [] numbers, int K)
     {
         
         if(K> N)
         {
         System.out.println("Invalid  K > N");
         }
         
         
         // calculate the possible combination 
         
        
         // get the possible combination by index
         // e.g. 01--> AB, 23 --> CD
         
         int combination[] =  new int [K];
         
         // position of current index
         // if(r == 1)
         // index == >  0 1 2 
         // element==>  1 2 3  
         
         int r = 0;
         int index = 0;
         
         while( r >=0)
         {
         
         
         
         }
     
     }
        
        
        
        
        
    
}

    
    
    
