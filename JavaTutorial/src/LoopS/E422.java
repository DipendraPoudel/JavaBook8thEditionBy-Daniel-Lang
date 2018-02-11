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
public class E422 {
    
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Loan Amount:");
    
    double loanAmount = sc.nextDouble();
    
    System.out.println("Enter the number of years:");
    
    double years = sc.nextDouble();
    
   // obtain the montly rate
    
    
    System.out.println("Enter the annualInterestRate .For example 5.25:");
    
    double annualInterestRate = sc.nextDouble();
    
    double monthlyInterestRate = annualInterestRate/1200;
    
    // compute the mortgage
    
    double monthlyPayment = loanAmount *  monthlyInterestRate /(1-1 /Math.pow(1+monthlyInterestRate, years *12));
    double totalPayment = monthlyPayment * years *12;
    
    double balance = loanAmount;
    double interestRate;
    double principal;
    
    
   // System.out.println("MonthlyPayment " + (int)(monthlyPayment *100)/100.0);
    //System.out.println("TotalPayment " + (int)(monthlyPayment *years * 12)/100.0 + "\n");
    
    //display the header
    System.out.println("Payment#\tInterestRate\tPrincipal\tBalance");
    
    for(int i = 1; i<= years *12; i++){
    
        interestRate =(int)(monthlyInterestRate * balance *100)/100.0;
        principal = (int)((monthlyPayment -interestRate)* 100)/100.0;
       balance = (int)((balance - principal)*100)/100.0;
    
    System.out.println(i + "\t\t"+interestRate +  "\t\t"+principal +   "\t\t"+balance);
    
    }
   
    }
}
