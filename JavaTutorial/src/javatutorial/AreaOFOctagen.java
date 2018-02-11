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
public class AreaOFOctagen {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one side:");
        
        double side =  input.nextDouble();
        
        
        double area = 2 *(1 + Math.pow(2,0.5 ))*Math.pow(side,2);
        
    System.out.println("The area of OCtagen is"+ (int) (area* 100)/100.0);
    
    
    
    
    
    }
    
    
    
    
}
