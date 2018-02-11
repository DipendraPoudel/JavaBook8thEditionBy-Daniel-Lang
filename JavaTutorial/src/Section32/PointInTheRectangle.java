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
public class PointInTheRectangle {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a point with two coordinates:");
        
        int x = input.nextInt();
        int y = input.nextInt();
        // given values
        int x1 = 0;
        int y1 = 0;
      
        
     
    
// Check whether the point is within the rectangle
// centered at (0, 0) with width 10 and height 5
      boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
        (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);
        
        
      // Display results
    System.out.println("Point (" + x + ", " + y + ") is " +
            ((withinRectangle) ? "in " : "not in ") + "the rectangle");
}


    
    
    
    
    
    }
    
    
    
    
    
    
    
    

