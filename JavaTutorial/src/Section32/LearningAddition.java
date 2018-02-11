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
public class LearningAddition {
    
    public static void main(String []args){
        
        double generatedNum1 =(int) (Math.random() * 50) ;   // math.random generates greater or equal 0.0 value and to get integers under 100, multiply the generated number     
        
        double generatedNum2 = (int) (Math.random() * 50);
    
        System.out.println("The two numbers are "+ generatedNum1 + " and "+ generatedNum2);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the total of two numbers :" );
        
        double total1 = input.nextDouble();
        
        double total = generatedNum1 + generatedNum2;
        
        
        if( total1 == total){
            
             
            System.out.println("Your answer is correct");
            
            }
        
        else{
        
            System.out.println("Your answer is incorrect.Enter again the total.");
        
        }
        
        
        
        
        
        
        
    
    
    }
    
    
    
    
}
