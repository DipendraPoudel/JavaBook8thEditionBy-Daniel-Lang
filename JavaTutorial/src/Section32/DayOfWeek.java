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
public class DayOfWeek{
    
    public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);
   
    System.out.println("Enter year (e.g.,2008):");
    
    int year = input.nextInt();
    
    System.out.println("Enter month: (1-12):");
    
    int month  = input.nextInt();
    
    System.out.println("Enter day of the month: (1-31):");
    
    
    int day  = input.nextInt();
    
    
    // check if month is january and february 
    // if month is january or february convert it to 13 or 14 
    // year has to -1 .(Go to previous year)
    
    if(month == 1 || month == 2) {
    
            month += 12;
            year--;
    }
    
    // computer answer 
    
    int k =   year % 100;     // get year of the century as given
    int j = (int)(year /100.0) ;  // get the century as given 
    int q = day;
    int m = month;
    
    
    
    
    int h = ( q  + (int) ((26 * (m  + 1)/10.0)) + k + (int)(k /4.0) + (int)((j /4.0) + 5 * j)) % 7; 
    
    
    
    
    String Result  = "Day of the week is  ";
    
    
        if( h == 0){

        System.out.println(Result + "Saturday");
        }

    
         else if(h == 1){

         System.out.println(Result + "Sunday");
        }   

         else if(h == 2){
         System.out.println(Result + "Monday");
        
        }
        
        
         else if (h == 3){
         
         System.out.println(Result + "Tuesday");
         }
    
         else if (h == 4){
         
         System.out.println(Result + "Wednesday");
        
         }
    
        
        
        else if (h == 5){
         
         System.out.println(Result + "Thursday");
        
         }
        
         else if (h == 6){
         
         System.out.println(Result + "Friday");
        
         }
    
}
}