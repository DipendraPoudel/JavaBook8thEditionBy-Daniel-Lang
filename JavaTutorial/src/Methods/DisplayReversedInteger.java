/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class DisplayReversedInteger {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Integer for reversal:");
        int value = input.nextInt();
     
         System.out.println("The reversal integer would be: "+reverse(value));   // the reverse method is callled here
    
    
    
    }
    
    public static int reverse(int number){
        
        int remainder ;
        int sum =0;
        
        
        while(number > 0){  //this while loops blocks runs until number is greater than 0.as soon as number becomes 0 
                                        // condition is false so loop terminates and returns the sum 
            remainder = number % 10;
            sum = (sum * 10)+ remainder;
            number = number/10;
            
        
        }  
        return sum;
        
      
        }  
        
    }
