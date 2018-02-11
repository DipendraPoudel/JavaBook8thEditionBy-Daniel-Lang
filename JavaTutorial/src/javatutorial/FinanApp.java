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
public class FinanApp {
    
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the balance:");
       double balance = input.nextDouble();
       System.out.println("Enter the annualInterestRate eg. 5.2 for 5.2%:");
       
     
       double annualInterestRate = input.nextDouble();
       double interest = balance *(annualInterestRate/1200);
       double newBalance = balance + interest;
       
       System.out.println("The interest is "+(int)(interest *100)/100.0+ "and the new balance is "+ ((int)(newBalance*100)/100.0));
       
       
       
        
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
}
