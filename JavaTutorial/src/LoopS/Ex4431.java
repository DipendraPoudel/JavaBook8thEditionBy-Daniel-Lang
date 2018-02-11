/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex4431 {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the initial deposit amount:");
        
        double initialDeposit = input.nextDouble();
        
        System.out.println("Enter the annual percentage yield:");
        
        double annualPercentage = input.nextDouble();
        
        System.out.println("Enter maturity period (number of months)");
        
        int  nMonths = input.nextInt();
        
        System.out.println("Month\t\t\t CD Value");
        
        
        double currentValue = initialDeposit + initialDeposit * annualPercentage/1200;
        for(int i =1; i <= nMonths; i++){
            
         double value = currentValue;
         
        currentValue = (currentValue + currentValue * annualPercentage/1200);
           
           
         System.out.println(i + " " + "\t\t\t"+ (int)(value  * 100 )/100.0);
        
           
        
        }
        
           
        
        
        
    
    
    
    }
    
}
