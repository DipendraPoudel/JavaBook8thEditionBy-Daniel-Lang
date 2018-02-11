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
public class NumberOfHours {
    
    public static void main(String [] args){
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        
        int totalSeconds = input.nextInt();
        
        int second = totalSeconds % 60; // get second is remainder of totalseconds divide by 60 which is total second in a minutes
        
        int totalMinutes = totalSeconds / 60;  // get totalminutes divide totalSeconds by total seconds in one minute which is 60 
        
        int minutes = totalMinutes % 60; // get minutes is remainder of totalMinutes divide by 60 which is total minutes in 1 hour
        
        int totalHours = totalMinutes / 60;  // get totalhours by dividing totalminutes by 60 which is total minutes in 1 hour
        
        
        System.out.println("1000000 seconds is "+totalHours + "hours" + ","+ minutes+ "minutes and "+ second +"seconds");
    
    
    
    
    
    
    }
    
    
    
}
