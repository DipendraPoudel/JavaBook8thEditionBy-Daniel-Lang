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
public class PointInCircle {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a point with two coordinates:");
    
    int x1  = input.nextInt();
    int y1  = input.nextInt();
    int x2 = 0;
    int y2 = 0;
    
    
    int d = (int) Math.sqrt((Math.pow ((x2 -x1),2)) + (Math.pow((y2- y1), 2)));
    
   System.out.println(d);

    
    if(d <= 10 ){
    
     System.out.println("The Point " +"("+x1+","+ y1+")"+ " is inside the Circle.");   
        
    }
            
  
    
    
    else {
    
    System.out.println("The Point " +"("+x1+","+ y1+")"+ "is not inside the Circle.");   
        
        
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
}
