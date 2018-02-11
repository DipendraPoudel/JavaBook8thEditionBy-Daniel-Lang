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
public class ConvertPound {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds:");
        
        double pound = input.nextDouble();
        double kilograms = pound* 0.454;
        
        System.out.println( pound +"pounds is" + kilograms +"in kilograms");
        
        
        
        
    
    
    
    
    }
    
    
}
