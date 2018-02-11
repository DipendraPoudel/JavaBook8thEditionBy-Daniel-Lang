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
public class Ex4430 {
    
    public static void main(String [] args){
    
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Enter an amount:");
        
        double  amount = input.nextDouble();
        
        System.out.println("Enter the number of months:");
        
         int nMonths = input.nextInt();
        
        double mRate =0.00417;
     
        // for loop to calculate total amount in savings as month keeps increasing
        
        double currentValue = amount *(1 + mRate);
        
        for( int i =1; i< nMonths; i++){
            currentValue = (currentValue +amount) * (1 + mRate);
            
             
                   
               
          
            } 
            
          
        System.out.println("The savings is "+((int) (currentValue  *100)/100.0));
               
            
            }
         
            
            
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

