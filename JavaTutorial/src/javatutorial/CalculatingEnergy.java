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
public class CalculatingEnergy {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the amount of water in Kilograms:");
    
        double waterAmount = input.nextDouble();
       
        System.out.println("Enter the initial temperature:");
        
        double tempInitial = input.nextDouble();
        
        System.out.println("Enter the final temperature:");
        
        double tempFinal = input.nextDouble();
        
        double energy = (waterAmount *(tempFinal - tempInitial))*4184;
        
        System.out.println("The energy needed is "+(int) energy * 10000);
        
        
    
    }
    
    
    
}
