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
public class Ex614ComputingGCD {
    static final int SIZE = 5;
     
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[SIZE];
        
        // ASK  THE USER TO ENTER THE FIVE NUMBERS AND STORE THEM INTO NUMBERS ARRAY
        System.out.println("Enter the five numbers for computing GCD:");
        for(int i = 0 ; i < numbers.length; i++)
        {
         int num = input.nextInt();
         numbers[i] = num;
        }
         
        
        System.out.println("The gcd of given numbers is " + gcd(numbers));
        
    }
    public static int gcd (int ... numbers)
            
    {
        int gcd = numbers[0];
        
        for(int i =1; i<numbers.length; i++)
        {    
            gcd = gcd(gcd, numbers[i]);
        
         }
        
        return gcd;

    
    
    }
    // return the gcd of two integers
    public static int gcd(int n1, int n2)
    {
   
        
          int gcd = 1; // Initial gcd is 1
          int k = 1;   // Possible gcd

        while (k <= n1 && k <= n2) {
          if (n1 % k == 0 && n2 % k == 0)
            gcd = k; // Update gcd
             k++;
        } 
      
        
        return gcd;
        
    
    
    
    
    
    }
}
