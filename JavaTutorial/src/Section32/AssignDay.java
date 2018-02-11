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
public class AssignDay {
    
    public static void main(String [] args){
    
        String dayName;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the day in number:");
        
        int day = input.nextInt();
        
        
        
        switch (day){
            
            case 0:  System.out.print(dayName = "sunday");
        
                break;
                
                
                
            case 1: dayName = "Monday";
                
                break;
                
                
                
            case 2: dayName = "Tuesday";
                
                break;
                
                
            case 3: dayName = "Wednesday";
                
                break;
                
                
            case 4: dayName = "Thursday";
                
                break;
                
                
            case 5: dayName ="Friday";
                break;
                
            case 6: dayName = "Saturday";
  
                break;
                
            default:System.out.println("Invalid day");
        
        
        
        
        
        }
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
