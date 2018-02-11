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
public class FinancialApp {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate:");
        
        double subtotal  = input.nextDouble();
       
        
        double CalculateGratuityRate = (subtotal * 15/100);
        double CalculateSubtotal = subtotal + CalculateGratuityRate;
        
        System.out.println("The gratuity rate is"+CalculateGratuityRate + "and the total is "+CalculateSubtotal);
        
        
    
    
    
    }
    
    
    
}
