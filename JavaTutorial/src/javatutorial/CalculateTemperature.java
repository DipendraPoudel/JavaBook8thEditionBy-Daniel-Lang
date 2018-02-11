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
public class CalculateTemperature {
    
    public static void main(String []args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature greater than 41F and not below -58F in Fahrenheit:");
    
    // variable v store the double temperature entered by user
    
    double ta = input.nextDouble();
    
    System.out.println("Enter the wind speed  greater than 2 miles per hour:");
    
    double v = input.nextDouble();  // variable v stores the speed of wind entered by user
    
    // variable twc stores the outside calculated temperature 
    double finalTemp =35.74 + (0.6215 *ta)- 35.75*Math.pow(v,0.16)+ 0.4257*ta* Math.pow(v, 0.16);
    
   
    
    System.out.println("The wind chill index is"+(int)(finalTemp *10000)/10000.0 );
    
    
    
    
    
    }
    
    
    
    
    
    
}
