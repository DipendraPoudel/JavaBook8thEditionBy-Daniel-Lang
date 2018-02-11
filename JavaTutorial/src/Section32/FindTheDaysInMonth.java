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
public class FindTheDaysInMonth {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
            
        System.out.println("Enter the month followed by year.eg. 2 and a year 2000:");
        
        boolean isLeapYear;
        
        int month = input.nextInt();
        int year = input.nextInt();
        
        // year is leap year if it is divisible by 4 but not by 100  or if it is diviisble by 400
        boolean isLeap = (year % 4 == 0 && year %100 !=0 )|| (year %100 ==0);
        
        
         if (month == 1 || month == 2 || month == 3 || month == 4 
                 || month == 5 || month == 6 || month == 7 || month == 8 
                 || month == 9 || month == 10 || month ==11 || month ==12){
         
         }
            if(month ==1){
            
                System.out.println("January" + year + "has 31 days");
            
            }
                
         
         else if(month ==3){
             
             System.out.println("March" + year +" has 31days");
         }
         
         else if(month == 5){
         
             System.out.println("May" + year +" has 31days");
         
         }
        
         else if(month == 7){
         
              System.out.println("July" + year +" has 31days");
         }
         
        
           
         else if(month == 8){
         
              System.out.println("August" + year +" has 31days");
         }
         
           else if(month == 10){
         
              System.out.println("October" + year +" has 31days");
         }
    
         
         
           else if(month == 12){
         
              System.out.println("December" + year +" has 31days");
         }
         
           else if( month == 4 || month == 6 || month == 9 || month == 11){
           
           }  
           
            if(month ==4 ){
           
               
               System.out.println("April" + year + " has 30days");
               
           }
           
             else if(month ==6){
           
               
               System.out.println("June" + year + "has 30days");
               
           }
           
             else if(month ==9 ){
           
               
               System.out.println("Sep" + year + " has 30days");
               
           }
           
           
              else if(month ==11 ){
           
               
               System.out.println("\bNov" + year + "\nhas 30days");
               
           }
           
              else{
                  if(isLeap){
                      
                      System.out.println("February" + year+ " has 29days");
                  }
                   
                  else {
                  
                  System.out.println("February"+ year + " has 28days");
                  }
                  
                  
                  
              
              }
         
        
            
           
           
           
            
         
         
         
         
         
         
    }
    
    
    
    
    
    
    
    
}
