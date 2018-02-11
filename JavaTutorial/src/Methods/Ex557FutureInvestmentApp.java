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
public class Ex557FutureInvestmentApp {
    
    public static void main(String [] args){
        
        final int NUMBER_OF_YEARS = 30;
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount:");
        double investmentAmount = input.nextInt();
        System.out.println("Enter interest Rate:");
        double intRate = input.nextDouble();
        
       // lets find out monthlyinterestRate
        
        double monthlyInterestRate =  intRate /1200;
        
        
        
        for(int years =1; years<= NUMBER_OF_YEARS; years++){
        			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		
        
        
        }
        
      
       
       
    
     
    }
    
        
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
   
    double  futureInvestmentValue =investmentAmount * Math.pow(1 + monthlyInterestRate,years *12);
        
    
    return futureInvestmentValue;
  
} 
        }
    
    
    
    

