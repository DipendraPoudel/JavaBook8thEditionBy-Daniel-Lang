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
public class NoOFDaysInMonth {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month:");
        int monthValue = input.nextInt();
        
        
        
        switch (monthValue){
            case 1: System.out.println("January has 31 days"); break;
                
            case 2:System.out.println("February has 28 days");break;
            case 3 :System.out.println("March has 31 days"); break;
            case 4 :System.out.println("April has 30 days"); break;
            case 5 :System.out.println("May has 31 days"); break;
            case 6 :System.out.println("June has 30 days"); break;
            case 7 :System.out.println("July has 31 days"); break;
            case 8 :System.out.println("August has 31 days"); break;
            case 9 :System.out.println("September has 31 days"); break;
            case 10 :System.out.println("OCtober has 31 days"); break;
            case 11 :System.out.println("November has 30 days"); break;
            case 12 :System.out.println("December has 31 days"); break;
               
        }
        System.out.println(displayInMonth(monthValue));
        System.out.println();
    
    
        }
    
    public static int displayInMonth(int month){
        
        while (month <=12){
        }
        
        
       return month;
    
       
        
    }
    
}
