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
public class MyTriangle {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side3 of triangle:");
                
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        
        if(isValid(s1,s2,s3))
        
            System.out.println("The area of triangle is "+ area(s1,s2,s3));
        
        
        else
            
            System.out.println(" Invalid input");
        
 
    }
    
    public static boolean isValid(double side1, double side2, double side3){
       
        return (side1 + side2)>side3;
       
    }
    
    public static double area(double side1, double side2, double side3){
        
       // in order to find the area of triangle we need to find s this is given formula
        
        
        double s = (side1+side2+side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
        
        
        return (int)(area  * 100 /100.0);
  
    }   
}
