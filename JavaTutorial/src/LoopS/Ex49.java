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
public class Ex49 {
    
    public static void main(String [] args){
    
    
    Scanner input = new Scanner(System.in);
    
    int number , max;
    number = input.nextInt();
    max = number;
    
    do{
        
        number = input.nextInt();
        if(number > max)
            max = number;
    }
   
    while(number !=0);
    
    
    System.out.println("max is " +  max);
    System.out.println("number is " + number);
    
    
    }
    
    
    
    
}
