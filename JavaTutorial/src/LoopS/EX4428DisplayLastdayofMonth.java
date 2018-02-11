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
public class EX4428DisplayLastdayofMonth {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        
        System.out.println("Enter the firstday of year:");
        
        int startDay = input.nextInt();
        
        int numberOfDaysInMonth = 0;
        
         for(int month = 1; month <= 12; month++){
             
             switch(month){
            
                 case 1:System.out.println("January 1 " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                     break;
                     
                 case 2:System.out.println("february 1 " + year);
                 
                        boolean isLeapYear = ( year %4 == 0 && year %100 == 0) ||(year % 400 !=0);
                        
                        if(isLeapYear){
                      
                        numberOfDaysInMonth =29;
                     
                        }
                        else{
                        
                        numberOfDaysInMonth =28;
                        }
                        
                  
                        break;
                 case 3:System.out.println("March 1 " + year + "is " );
                      
                     numberOfDaysInMonth = 31;
                     
                      
                     break;
                
                 case 4:System.out.println("April 1 " + year);
                      
                     numberOfDaysInMonth = 30;
                     
                      
                     break;
                 case 5:System.out.println("May 1 " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                      
                     break;
                
                 case 6:System.out.println("June 1 " + year);
                      
                     numberOfDaysInMonth = 30;
                      
                     break;
                     
                 case 7:System.out.println("July 1" + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
                     
                
                 case 8:System.out.println("August 1 " + year);
                      
                     numberOfDaysInMonth = 31;
                     
                 case 9:System.out.println("September 1 " + year);
                      
                     numberOfDaysInMonth = 30;
                     
                      
                     break;
                
                 case 10:System.out.println("October" + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
                
                 case 11:System.out.println("November 1" + year);
                      
                     numberOfDaysInMonth = 30;
                      
                     break;
 
                 case 12:System.out.println("December1 " + year);
                      
                     numberOfDaysInMonth = 31;
                      
                     break;
        
             }
             
            switch(startDay){
                
                case 0:System.out.println("Sunday");
                    
                    break;
            
                case 1:System.out.println("Monday");
                    break;
                    
               
                case 2:System.out.println("Tuesday");
                    break;
                
            
                case 3:System.out.println("Wednesday");
               
                    break;
                    
                    
                
                case 4: System.out.println("Thursday");
                    break;
                    
                    
                
                case 5:System.out.println("Friday");
                    break;
                    
                    
               
                case 6:System.out.println(" is Saturday");
                    break;
                    
               
                
            }
              
            // get the firstday of next month
            
            startDay =(startDay * numberOfDaysInMonth) %7;
            
            System.out.println();
            
            }
      
                
            }
        
             
        
        }
            

