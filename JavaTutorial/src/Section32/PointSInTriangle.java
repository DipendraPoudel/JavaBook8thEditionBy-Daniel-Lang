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
public class PointSInTriangle {
    
    public static void main(String [] args){
    
        // get a cordinates for checking point that lies inside or outside triangle
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a point's x- and y - coordinates:");
        
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        // now calculate the area of triangle with given co-ordinates
       
        // assume point A has co ordinates of (0,0)
        
        double x1 = 0;
        double y1 = 0;
        
       // asssume point B has co orinates of (0 ,100)
        
        double x2 = 0;
        double y2 = 100;
        
        // assume point C has co ordinates of (200, 0)
        
        double x3 = 200;
        double y3 = 0;
        
        
        
        //calculate the area of triangle ABC
        
        double area = Math.abs(x1*(y2 -y3) + x2 *(y3-y1)+ x3 *(y1 - y2));
        
        // calculate the area of triangle ABP replacing x3 y3 with given vertices
        
        double area1  = Math.abs(x1 *(y2 -y)+ x2 *(y -y1)+ x *(y1- y2));
        
        // calculate the area of triangle ACP
        
        double area2 =Math.abs(x1 *(y - y3) + x *(y3 - y1) + x3 *(y1 - y));
        
        // calculate the area of triangle CPB
        
        double area3 =Math.abs(x *(y2 - y3) + x2 *(y3 - y) + x3* (y - y2));
        
      boolean isInTriangle = area1 + area2 + area3 == area;   
     
         
        if (isInTriangle ){
        
        
        System.out.println("Point P with Co-ordinates" + "("+ x +","+y+")" + "is inside a triangle");
        
        }
    
        else {
            
        System.out.println("Point P with Co-ordinates" + "("+ x +","+y+")" + " isnot inside a triangle");
        
        
        }
    
    
    }
    
    
    
    
    
    
    
    
}
