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
public class Ex47 {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter the integers:");
    
    int number, max;
    
    number = input.nextInt();
    max = number;
    
    
    while(number !=0){
    
     number = input.nextInt();
     
     if(number > max)
         max = number;
    
    
    
    
    System.out.println("max is"+ max);
    System.out.println("number" + number);
    
    
    }
    
    }
    
}  
    
    
    
    
    
    
    
    

