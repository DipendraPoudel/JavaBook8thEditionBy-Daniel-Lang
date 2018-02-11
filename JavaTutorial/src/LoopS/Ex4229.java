/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex4229 {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Year:");
        
        int year = input.nextInt();
        
        System.out.println("Enter the firstDay of the Year:");
        
        int firstDay = input.nextInt();
        
        int numberOfDaysInMonth =0;
        
       // loop for find month 
        for(int month = 1; month <=12; month++){
            
            System.out.println();
            System.out.print("          ");
            switch (month){
                
                 case 1:System.out.println("January " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                     break;
                     
                 case 2:System.out.println("february" + year);
                 
                        boolean isLeapYear = ( year %4 == 0 && year %100 == 0) ||(year % 400 !=0);
                        
                        if(isLeapYear){
                      
                        numberOfDaysInMonth =29;
                     
                        }
                        else{
                        
                        numberOfDaysInMonth =28;
                        }
                        
                  
                        break;
                 case 3:System.out.println("March  " + year );
                      
                     numberOfDaysInMonth = 31;
                     
                      
                     break;
                
                 case 4:System.out.println("April  " + year);
                      
                     numberOfDaysInMonth = 30;
                     
                      
                     break;
                 case 5:System.out.println("May  " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                      
                     break;
                
                 case 6:System.out.println("June  " + year);
                      
                     numberOfDaysInMonth = 30;
                      
                     break;
                     
                 case 7:System.out.println("July " + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
                     
                
                 case 8:System.out.println("August " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                     break;
                     
                 case 9:System.out.println("September  " + year);
                      
                     numberOfDaysInMonth = 30;
                     
                      
                     break;
                
                 case 10:System.out.println("October" + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
                
                 case 11:System.out.println("November " + year);
                      
                     numberOfDaysInMonth = 30;
                      
                     break;
 
                 case 12:System.out.println("December " + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
                
            
            }
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            
           
            
     // 
                
                for(int i = 0; i< firstDay; i++){
                      System.out.print("    ");
                }
                
                for(int i = 1; i<=numberOfDaysInMonth; i++){
                
                    
                    
                    if(i < 10){
                    
                      System.out.print("   " + i);
                    }
                    else{
                      System.out.print("  " + i);
                    
                    }
                    
                    
                    if((i + firstDay)%7 ==0){
                    
                    
    
                System.out.println();
                    }
                    
                }
                
    
                System.out.println("");
                                 
              
            firstDay =(firstDay + numberOfDaysInMonth) %7;
                    
               
            
               
            
                
    }}  
                       
        
    
}