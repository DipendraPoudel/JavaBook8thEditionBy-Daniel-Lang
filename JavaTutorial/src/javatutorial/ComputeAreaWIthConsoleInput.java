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
public class ComputeAreaWIthConsoleInput {
    
    public static void main(String [] args){
    
    // create a scanner object
        
        Scanner input = new Scanner(System.in);
        
        // ask the user to enter a radius(input)
        
        System.out.println("Enter the value of radius");
        
        double radius = input.nextDouble();
        
        double area = radius * 3.14159;
        
        
       // Display a results
        
        System.out.println("the area for the circle of radius "+ radius + "is"+ area);
                
    
    
    }
    
    
}
