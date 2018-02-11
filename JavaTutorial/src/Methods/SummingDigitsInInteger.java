/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class SummingDigitsInInteger {
    
    public static void main(String [] args) throws IOException{
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the integer");
       
       int value = input.nextInt();
       
       System.out.println(sumDigits(value));
       
       
    
    
    
    }
    
   public static int sumDigits(long n){
        int temp = (int)Math.abs(n);
        int sum =0;
        
        
        while( temp !=0){
            int remainder = temp %10;
            sum +=remainder;
            temp = temp/10;
            
        
        
        
        }
        
        return sum;
        
    
    
    
        
        
        
    }
}


    
    

