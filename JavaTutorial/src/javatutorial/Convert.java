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
public class Convert {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter centimeters as an integer:");
        
        double num  = input.nextDouble();
        double inches = num * 0.3937;
        
        System.out.println("The value in inches is "+ inches);
        
        
    
    
    
    }
    
}
