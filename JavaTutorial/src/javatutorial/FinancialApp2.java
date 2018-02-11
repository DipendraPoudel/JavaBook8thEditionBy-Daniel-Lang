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
public class FinancialApp2 {
    
    public static void main(String []args){
    
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter investement investment Amount:");
    
    double investmentAmount = input.nextDouble();
    
    System.out.println("Enter annual interest Rate:");
    
    double annualRate = input.nextDouble();
    double monthlyRate = annualRate/1200;
    
    
    
    System.out.println("Enter number of years:");
    
    int numberOfYears = input.nextInt();
    
     double FinValue = investmentAmount *  Math.pow(1+ monthlyRate,numberOfYears *12);
    
     System.out.println("Accumulate Value is "+ FinValue );
    
    
    
    
    
    
    
    
    }
    
    
    
    
}
