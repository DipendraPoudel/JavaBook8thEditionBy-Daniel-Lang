package Methods;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dipendra
 */
public class Ex522MathSqrtMethod {
    
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the postive number:");
        double number = input.nextDouble();
        
    
        System.out.println("The square root is :  "+ sqrt(number));
    
    }
    
    
    public static double sqrt(double num){
        double nextGuess = 1.0;
        double lastGuess;
        
        
        do{
            lastGuess = nextGuess;
            nextGuess = (lastGuess +(num /lastGuess)) * 0.5;
        
        }
        
    while (Math.abs(nextGuess - lastGuess) >= 0.00001);
        
        
        
        
        return nextGuess;
    
    
    
    
    
    
    
    }
    
}
