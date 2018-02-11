
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
public class HealthAppl {
    
    public static void main(String []args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the weight:");
        
        double w = input.nextDouble();
        
        System.out.println("Enter the height in feet and inches together separated by space:");
        
        double h = input.nextDouble();
        
        double wKilograms = (w * 0.45359237);
        
        double heightInFeet = (h * 0.0833333);  // 1 inch = 0.0833333 feet
        
        
        
        double BMI = (wKilograms/heightInFeet * heightInFeet);
        
    
        
        System.out.println("The BMI for this person is "+ (int)(BMI *100)/100.0);
    
    
    
    
    }
    
    
    
    
    
    
}
