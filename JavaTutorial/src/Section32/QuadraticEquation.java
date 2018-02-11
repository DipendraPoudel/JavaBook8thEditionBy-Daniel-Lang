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
public class QuadraticEquation {
    
    public static void main(String [] args){
        double root1 =0;
        double root2=0;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the values for a , b , c:");
        

        double a = input.nextDouble();
        
        double b = input.nextDouble();
        
        double c = input.nextDouble();
        
        
        double discriminant = (Math.pow(b, 2) - 4 * a * c);
        
        
        
  
        root1 = (- b + Math.sqrt(discriminant))/(2 * a);
        root2 = (- b - Math.sqrt(discriminant))/(2 * a);
        
        
       
        if(discriminant > 0){
        
            System.out.println("The two roots are :"+ root1 +" and " + root2);
        
        
        }
        
        
        if(discriminant ==0){
        
            System.out.println("The one root is"+ root1);
         }
        
        if(discriminant <0){
        
            System.out.println("It has no real roots");
        
        }
        
        
        
        
        
        
        
        
        
        
    }}
        
        
        
     
       

            
            
  
        
       
    
    
    
    
    
    
    
    
    
    
        

        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

