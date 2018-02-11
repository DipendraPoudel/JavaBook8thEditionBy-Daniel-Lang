/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;


/**
 *
 * @author dipendra
 */
public class EX534AreaOfPentagon {
    // main method
    public static void main(String args[]){
    
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the sides of the Pentagon:");
        double side = input.nextDouble();
        
         System.out.println("The area of the Pentagon is " +getArea(side));
    }
    
    public static double getArea(double side){
        
        
        double area = (int)(5 * Math.pow(side, 2)/4 * Math.tan(Math.PI/5));
        
        
        
        return area;
    
        
    
    
    }
    
    
    
    
    
    
    
    
}
