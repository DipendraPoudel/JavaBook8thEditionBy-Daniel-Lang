/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Multiplication {
    
    public static void main(String [] args){
     // read the number from the console
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer between 100 and 999");
        
        int number = input.nextInt();
        
        // find all the digits in number
        
        int lastDigit = number % 10;
        int remainingNumber = number/ 10;
        int secondLastDigit = remainingNumber % 10;
         remainingNumber = remainingNumber /10;
        int thirdLastDigit = remainingNumber % 10;
        
        int sum = lastDigit * secondLastDigit * thirdLastDigit;
        
        System.out.println("The product of the digits is "+ sum);
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    }
    
    
    
}
