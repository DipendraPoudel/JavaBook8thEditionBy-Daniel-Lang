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
public class CompoundValue {
    
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the each month savings in Savings account:");
        
        double savings = input.nextDouble();
        
        double firstMonthSavings = savings * (1+0.005417);
        double secondMonthSavings =  ((savings +firstMonthSavings) *(1 + 0.005417));
        double thirdMonthSavings =  ((savings +secondMonthSavings) *(1 + 0.005417));
        double fourthMonthSavings =  ((savings +thirdMonthSavings) *(1 + 0.005417));
        double fifthMonthSavings =  ((savings +fourthMonthSavings) *(1 + 0.005417)); 
        double sixthMonthSavings =  ((savings +fifthMonthSavings) *(1 + 0.005417));
        
        System.out.println("The value in six months is "+ (int)(sixthMonthSavings * 100)/100.0);
      
        
    
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
