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
public class ConvertingMilitaryTime {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);
    
    
    System.out.println("Enter the hour:");
    
    int hour = input.nextInt();
    
    System.out.println("Enter the minute:");
    
    int min = input.nextInt();
    
    
    String hourIn12 = "";
    
    
    switch(hour){
    
        case 12 : hourIn12 = "12";
            break;
 
        case 13 : hourIn12 = "1";
            break;
            
        case 14 : hourIn12 = "2";
            break;
            
        case 15 : hourIn12 = "3";
            break;
            
        case 16 : hourIn12 = "4";
            break; 
            
        case 17 : hourIn12 = "5";
            break;
            
        case 18 : hourIn12 = "6";
            break;
        
        case 19 : hourIn12 = "7";
            break;
             
       
        case 20 : hourIn12 = "8";
            break;
             
         
        case 21 : hourIn12 = "9";
            break;
             
        case 22 : hourIn12 = "10";  
            break;
            
                 
        case 23 : hourIn12 = "11";  
            break;
            
        case 24 : hourIn12 = "12";  
            break;
    
    
    }
    
    // converting String into int 
    
    int TimeInTwelveHour = Integer.parseInt(hourIn12);
    

    
    
    if(((hour >= 12) || (hour <= 24 )) && ((min >= 1) || (min <=59))) {
    
    
 
    System.out.println("The standard Time is " + TimeInTwelveHour +":"+ min);
    
    }
    
    else{
        
   
    System.out.println("Invalid Input");
    }
    
    }

    
    
    
    
    
    
    
    
}
