/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class MonetaryUnit {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        // receive amount
        System.out.println("Enter the amount in double for example 11.60:");
        
        double amount = input.nextDouble();
        
          int remainingAmount = (int)(amount * 100);
        
        // find the numbers of one dollars
        
        int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount %100;           // the remainder money will be now remainingamount which is remainder of 100
            
           //find the numbers of quarters
        //int numberOfQuarters = remainingAmount /25;
        
            remainingAmount = remainingAmount %25;
            
            
        // find the numbers of dimes in remaining amount
            
            //int numberOfDimes = remainingAmount /10;
            
                remainingAmount = remainingAmount %10;
                
             // find the numbers of nickles
                
           // int numberOfNickles = remainingAmount /5;
            
            
                remainingAmount = remainingAmount % 5;
                
            // find the pennies
                
             int numberOfPennies = remainingAmount;
            
        
        
             if(numberOfOneDollars > 1  && numberOfPennies >1){
                 
                 System.out.println("Your amount "+ amount +" consists of \n" + "\t" + numberOfOneDollars +"dollars\n" +
                                    
                         "\t"+ numberOfPennies + "Pennies" );
                                
                       
             
             
             }
             
             else{
                 
                 System.out.println("Your amount "+ amount +"consists of \n" + "\t" + numberOfOneDollars +"dollars\n" +
                                    
                         "\t"+ numberOfPennies + "Penny" );
                                
                 
             
             
             
             }
        
        
        
        
        
        
    
    
    
    
    
    
    }
    
    
    
    
}
