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
public class CheckNumber {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer");
        
        int number = input.nextInt();
        
        
        
        
        if(number % 2 == 0){
            
            System.out.println("Is"+ number + "an odd number?" +"false");
         
        }
        
        else{
            System.out.println("Is"+number+"an odd number?"+ "True");
        
        }
    
    
    
    
    
    
    }
    
    
    
    
}
