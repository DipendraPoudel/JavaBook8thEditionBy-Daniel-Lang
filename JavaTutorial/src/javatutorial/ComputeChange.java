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
public class ComputeChange {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer ");
        
        int amount  = input.nextInt();
        
         // find the number of dollars
        double numberOfDollars = (double)(amount/100);
        double cents = (double)(amount % 100);
        
        System.out.println("THe dollars is" + numberOfDollars);
        System.out.println("The cents is " + cents);
        
        
        
        
        
        
    
    
    } 
}
