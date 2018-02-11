/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class PickLowestNumber {
    
    public static void main(String [] args){
    
        double x  = (int)(Math.random() * 10);
        double y = (int)(Math.random() *  10);
        double z = (int)(Math.random() * 10);
        
        System.out.println("The three integers are "+ (int)x  +"," +(int)y +" and " +(int) z);
        
        System.out.println("Now Enter the lowest integers out of three :");
        
        Scanner input = new Scanner(System.in);
        
        int lowestNum = input.nextInt();
        
        
        
        if( (x > lowestNum || y > lowestNum)  && z >lowestNum ){
            
            System.out.println("You have entered lowest number!True");
            
        
        }
        
        else{
            
            System.out.println("You have entered wrong lowest number!false ");
        
        
        
        }
        
        
        
        
        
        
        
    
    
    
    
    }
    
    
    
    
    
    
    
}
