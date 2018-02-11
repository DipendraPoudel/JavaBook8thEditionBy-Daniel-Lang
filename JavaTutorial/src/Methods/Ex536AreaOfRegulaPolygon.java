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
public class Ex536AreaOfRegulaPolygon {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides of the polygon:");
        
        int n = input.nextInt();
        
        System.out.print("Enter the side of the polygon:");
        
        double side = input.nextDouble();
        
        
        System.out.println("The area of n-sided regular polygon is :"+ getArea(n,side));
    
    
    
    }
    
    public static double getArea (int n, double side){
        
        
        double area = (int) (n * Math.pow(side, 2)/(4 * Math.tan(Math.PI/n)));
        
        
        
    
        return area;
    
    
    
    }
    
    
}
