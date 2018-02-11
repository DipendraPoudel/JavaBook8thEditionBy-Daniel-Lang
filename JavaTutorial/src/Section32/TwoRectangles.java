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
public class TwoRectangles {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter r1's center x-, y- coordinates, width ,and height:");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        
        
        
        System.out.println("Enter r2's center x- , y - coordinates, width, and height:");
        
        
            
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        
        
        // computing distance between two points
        
        double distx1x2 = Math.pow(Math.pow(x2 - x1 ,2),0.5);
        double disty1y2 = Math.pow(Math.pow(y2 - y1 ,2),0.5);
        
        
    // computing distance between two edges
        
         
        double distW = (w1/2) +(w2/2);
        double distH = (h1/2) +(h2/2);
    
    
         
     if(distx1x2 > distW || disty1y2 > distH){
     
     System.out.println("The rectangle r2 doesn't overlap r1");
     
     } 
     
     else if(distx1x2 < w1 && disty1y2 < h1 && distW < w1 && distH < h1){
     
     System.out.println("The rectangle r2 is inside r1");
     
     }
         
     
     else{
     
     System.out.println("The rectangle r2 overlaps r1");
     
     }
    }
    
    
    
    
    
}
