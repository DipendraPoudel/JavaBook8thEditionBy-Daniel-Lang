/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

/**
 *
 * @author dipendra
 */
public class Ex67CountingSingleDigits {
    
     static final int SIZE = 100;
     static final int RANGE =10;
    
    public static void main(String [] args)
    {
        
        int [] randomNumbers = new int[SIZE];
        int [] occurence = new int [RANGE];
  
     // generate random integers 0 -9 
        for(int i = 0; i<randomNumbers.length ; i++)
        {
          int nums = (int) (Math.random() * RANGE);
          randomNumbers[i] = nums;
          occurence[nums]++;
          
        
    
        }
        System.out.println("The random numbers are:");
        for(int i = 0; i< randomNumbers.length; i++)
        {
             
            System.out.print(randomNumbers[i]+ "");
            if((i + 1) % 10 ==0)
                System.out.println("");
            
            
        
        
        }
        
        System.out.println("---------------------------------");
        
        for(int i =0; i<occurence.length; i++)
        {
        System.out.println("occurence for " + i +" is " + occurence[i] + " times");
        
        
        }
    }
    
    /**public static void printArray(int[]array,int numberPerline)
    {
    
    for(int i = 0; i<array.length; i++)
    {
        System.out.printf("%4df",array[i]);
        if((i+1)% numberPerline == 0)
            System.out.println("");
        
                
    
    
    
    }
    **/
    
    
    
    
    
   // }
    
    
    
}
