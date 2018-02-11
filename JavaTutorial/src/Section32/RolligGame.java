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
public class RolligGame {
    
    public static void main(String [] args){
        
        int n = (int)(Math.random() * 6) +1;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("The number is " + n);
        
        System.out.println("Enter that number you guess?");
        
        int guessNumber = input.nextInt();
    
    
        if(n == guessNumber){
        
        
        System.out.println("Correct guess");
        
        
        }
        
        else {
        System.out.println("Incorrect guess");
        
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
