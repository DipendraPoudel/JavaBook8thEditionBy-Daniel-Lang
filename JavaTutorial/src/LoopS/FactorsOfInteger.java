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
public class FactorsOfInteger {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a positive integer");
    
    int integer = input.nextInt();
    
    int factor = 1;
    // possible factors
    
   System.out.println("The factors for number " + integer +"are :"); 
   
     
    
   while( factor <= integer){
   
    if(integer % factor == 0){
        
        
            System.out.format("%-5s ",factor);
            
         
       // System.out.printf( "%5s,",factor);
    
    }
    
   factor++;
   
    
   } 

    }
    
    
    
}
