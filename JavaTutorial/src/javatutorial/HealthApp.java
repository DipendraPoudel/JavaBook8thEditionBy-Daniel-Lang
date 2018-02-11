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
public class HealthApp {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the weight in pounds:");
        
        double weight = input.nextDouble();
        
        double weightInKilograms  = (weight * 0.45359237);
        
        
        System.out.println("Enter the height in inches");
        
        double height = input.nextDouble();
        
        double heightInMeters = height * 0.0254;
        
        double BMI = (weightInKilograms/(heightInMeters* heightInMeters));
        
        System.out.println("BMI \t"  + (int)(BMI *10000)/10000.0);
        
        
        
        
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
}
