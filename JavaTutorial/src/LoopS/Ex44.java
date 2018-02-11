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
public class Ex44 {
    
    public static void main(String []args){
    
      int sum = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the integer");
      
      int number = input.nextInt();
      
      do{
      
          
        sum += number  ; 
        
        System.out.println( sum);
       // here 0 is sentinel value because the program terminates if input is 0 or equal to zero
        
      }while( number !=0);
    
       
    
    
    }
    
    
    
}
