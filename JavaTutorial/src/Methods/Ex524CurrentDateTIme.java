/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import javax.swing.JOptionPane;

/**
 *
 * @author dipendra
 */
public class Ex524CurrentDateTIme {
    
    public static void main (String args[]){
        
        // obtain total Millisecond since midnight  Jan 1, 1970
        
        long totalMilliSeconds = System.currentTimeMillis();
        
        // obtain the total seconds since midnight Jan 1, 1970
        
        long totalSeconds = totalMilliSeconds/1000;
        
        // Compute the current second in the minute of the hour
        
        long currentSecond =  (int)(totalSeconds % 60);
        
        //obtain total minutes
        
        long totalMinutes = totalSeconds/60;
        
        //compute the current minute in the hour
        
        long currentMinute = (int)(totalMinutes % 60);
 
        // obtain total hours
        
        long totalHours = totalMinutes /60;
        
        // obtain current hours
        
        long currentHours = (int)(totalHours % 24);
        
        // compute total days
        
        int totalDays = (int) (totalHours/24);
        if(currentHours >0) totalDays++;
        
        
        // obtain year
        
        int currentYear = 2000;
        
        do{
            currentYear++;
        }
         while (getTotalDaysInYears(currentYear)< totalDays);
        
    
        // obtain month
        
        int totalNumberOfDaysInTheYear = totalDays - getTotalDaysInYears(currentYear -1);
        
        int currentMonth = 0;
    
        do {
            currentMonth++;
        }
        
        while (getTotalDaysInMonth(currentYear, currentMonth) < totalNumberOfDaysInTheYear);

        
    
         int currentDay = totalNumberOfDaysInTheYear - getTotalDaysInMonth(currentYear , currentMonth -1);
    
    // Display results
         
         String output = "Current Date and Time is "+ currentDay + "/"+ currentMonth +"/"+currentYear+" "+
                 currentHours +":"+ currentMinute +":"+currentSecond  + " GMT" ;
         
         
         JOptionPane.showMessageDialog(null , output);

    }
    public static int getTotalDaysInYears(int year){
       int total = 0;
       // get the total number of days from 1800 to 1/1/year
        
       for(int i = 1970; i <= year ; i++)
           if(isLeapYear(i))
               total = total + 366;
           
           else
               total = total + 365;
        
         return total;
    
    }
    
    // get totalNumberOfDays from Jan 1 to the month in the years
    
    public static int getTotalDaysInMonth(int year , int month){
        
        int total = 0;
        
        for(int i = 1; i<= month ; i++)
            
            total = total + getNumberOfDaysInMonth(year , i);
        
            
            
        return total;
        
    
    }
    
    
    
    
    
    public static int getNumberOfDaysInMonth(int year, int month){
        
        if(month ==1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10
                || month ==12)
        
            return 31;
        if(month == 4 || month == 6 || month == 9 || month ==11)
            
            return 30;
        
        if(month == 2) return isLeapYear(year)?29:28;
       
        return 0;  // if month is incorrect
    
    }
    
    public static boolean isLeapYear(int year){
        
        return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);
        
        
    
    }

    
}
