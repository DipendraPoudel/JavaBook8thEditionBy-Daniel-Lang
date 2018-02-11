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
public class AreaOfTriangle {
    
    
    
    public static void main(String []args){
    
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter three points for a triangle:");
    
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
               
        
        // find the sides using math.pow(a, b)
        
        
        double side1 =Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        double side2 =Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        double side3 =Math.pow(Math.pow(x3-x1,2)+Math.pow(y3-y1,2),0.5);
    
        
        double s = (side1+side2+side3)/2;
        
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
        
        System.out.println("The area of triangle is :"+(int) (area *100)/100.00);
    
        
    
    
    
    }
    
    
    
    
}
