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
public class SolvingLinearEquation {
    
    public static void main(String []args){
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the a , b , c , d ,e , f:");
        
        double a = input.nextDouble();
        
        double b = input.nextDouble();
        
        double c = input.nextDouble();
        
        double d = input.nextDouble();
        
        double e = input.nextDouble();
        
        double f = input.nextDouble();
        
        
        
       double divisor  =(a *d) - (b *c);
       
       double x = ((e * d ) -(b *f ))/divisor;
       
       double y = ((a * f) - (e * c))/divisor;
               
       
       
       if(divisor == 0){
       
           System.out.println("The equation has no solution.");
           
           
        }
       
       else{
       
           System.out.println("x is "+ x +" and " + "y is " + y);
       
       
       }
        
        
        
        
                
                
                
                
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
}
