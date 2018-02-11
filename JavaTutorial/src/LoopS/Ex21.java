
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
public class Ex21 {
    
    
    public static void main(String [] args){
        
        double annualInterestRate =5.00;
        
        
    
    Scanner sc = new Scanner(System.in);
    System.out.printf("Loan Amount:");
    
    double loanAmount = sc.nextDouble();
    
    
    System.out.println("Enter years");
    
    double numberOfYears = sc.nextDouble();
     
   
           
    
    
    System.out.println("\t\tInterestRate\t\tMonthlyPayment\t\tTotalPayment");
    
    
    for(; annualInterestRate <=8.00; annualInterestRate +=0.125){
    
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate/ (1 - 1 / Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
    
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        System.out.println("\t\t"+annualInterestRate +"\t\t\t"+((int) (monthlyPayment *100))/100.0 +"\t\t\t"+((int)(totalPayment *100))/100.0);
        
        
    }
    
    
    

    
    }
}
