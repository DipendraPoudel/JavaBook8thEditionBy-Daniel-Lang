/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class PrintCalendar {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //prompt user to enter input
        System.out.println("Enter the full year eg.2005:");
        int year = input.nextInt();
        
        System.out.println("Enter the Month eg.2005:");
        int month = input.nextInt();
        
        
    // printMonth method to print calendar and month since this is void method it is invoked as a statement
        
        printMonth(year,month);
     }
    
    // Print the calendar for a month in a year
    public static void printMonth(int year, int month){
        // print headings of the calendar
        printMonthTitle(year, month);
        //  print the body of the calendar
        printMonthBody(year,month);
        
    
    }
    // a stub for printMonthTitle
    public static void printMonthTitle(int year, int month){
        System.out.println("        "+ getMonthName(month) + "   "+ year);
        System.out.println("-----------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    
    }
     //GET THE ENGLISh name for the month
    public static String getMonthName(int month){
        String monthName = " ";
        switch(month){
            case 1: monthName  = "January" ; break;
            case 2: monthName  = "february" ; break;
            case 3: monthName  = "March" ; break;
            case 4: monthName  = "April" ; break;
            case 5: monthName  = "May" ; break;
            case 6: monthName  = "June" ; break;
            case 7: monthName  = "July" ; break;
            case 8: monthName  = "August" ; break;
            case 9: monthName  = "September" ; break;
            case 10: monthName  = "October" ; break;
            case 11:monthName = "November" ; break;
            case 12:monthName = "December" ;
            }
       
        return monthName;
    }
     public static void  printMonthBody(int year, int month){
         
         // get the startDay of the week first date  in the month
         
         int startDay = getStartDay(year, month);
         
         // get numberof days in th emonth
         int numberOfDaysInMonth = getNumberOfDaysInMonth(year ,month);
         //pad space before the first day of month
         
        
         for(int i =0; i<startDay ; i++){
              System.out.print("    ");
                
         }
            for(int i =1; i<= numberOfDaysInMonth; i++){
               
                if(i <10){
                  
                    System.out.print("   " + i);
                }
                else{
                    
                    System.out.print("  "+ i);
                
                }

               if((i + startDay) % 7 == 0){

                   System.out.println();
               }

            }
             
                System.out.println("");
         
         }
       
         
    
     public static int getStartDay(int year, int month){
         final int START_DAY_FOR_JAN_1_1800 =3;
         
         int totalNumberOfDays = getTotalNumberOfDays (year,month);
         
         return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800)%7;
      
       
    }
    
     public static int getTotalNumberOfDays(int year, int month){
         int total =0;
         
         // Get the total days from the year 1800 to 1/1/year
         
         for(int i = 1800; i <year; i++)
             if(isLeapYear(i)){
         
           total = total +366;
             }
             else{
                 total = total+ 365;
             }
        // add days from jan  to the month prior to the calendar month
        
        for(int i = 1; i < month ; i++)
        
         total = total + getNumberOfDaysInMonth(year, i);
            
        
        return total;    
         
         }
     
     
     public static int getNumberOfDaysInMonth(int year, int month){
         
         if(month ==1 || month ==3 || month == 5 || month == 7 || month ==8 || month ==10 || month ==12)
         return 31;
         
            if(month == 4 || month == 6 || month == 9 || month == 11)
                return 30;
                    if(month == 2) return isLeapYear(year)?29 :28;
                    
                        return 0; // if month is incorrect
     }
     
     
     
     
    
    public static boolean isLeapYear(int year){
    
        
    return year % 400 == 0 || (year %4 ==0 && year % 100 !=0);
    }
}