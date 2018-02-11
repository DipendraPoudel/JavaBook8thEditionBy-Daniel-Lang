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
public class CurrentTime {
    
    
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the time zone offset to GMT:");
        
        int gMTtimeZoneOffset = input.nextInt();
        
        
        long totalMilliseconds  = System.currentTimeMillis();
        
        // obtain the total seconds since midmnight  jan 1 1970
        
        
        long totalSeconds  = totalMilliseconds /1000;
        
        // obtain the current second in the minute in the hour
        
        long currentSecond = (int)(totalMilliseconds % 60);
        
        
        //obtain the total minute
        
        
        long totalMinutes = totalSeconds / 60;
        
        // compute the current minute in the hour
        
        long currentMinute = totalMinutes %60;
        

        // obtain total hours
        
        long totalHours = totalMinutes /60;
        
        // compute the current hours
        
        
        long currentHours = totalHours %24;
        
         currentHours =  (currentHours + gMTtimeZoneOffset);
 
        
        System.out.println("Current time is"+ currentHours +":"+currentMinute+":"+currentSecond+ "GMT");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
    
    
    
    
    
    }
    
    
    
    
    
}
