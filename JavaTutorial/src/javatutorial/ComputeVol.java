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
public class ComputeVol {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of the cylinder");
        double radius  = input.nextDouble();
        double length = input.nextDouble();
        
        double area = radius* radius * 3.16;
        double volume = area* length;
        
        System.out.println("The area of the cylinder is"+ area);
        System.out.println("The volume of the cylinder is"+ volume);
                
        
        
    
    
    
    
    
    }
    
    
}
