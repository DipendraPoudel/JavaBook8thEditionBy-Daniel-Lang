/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

/**
 *
 * @author dipendra
 */
public class Ex4427DisplayingLeapYears {
    
    //a leap year is which is divisible by 4 but not by 100 or if divisible by 4000
    // so using boolean to check if the year is leap or not
    public static void main(String [] args){
   
    int count =0;
    int year =0;
    int NUMBER_OF_LINES = 10;
    
    for(int i= 1801 ; i <=1900 ; i++){
    
     year = i;
    
    
     boolean isleapYear = (year % 100 !=0  && year % 4 == 0) || (year % 4000 == 0);

     if(isleapYear){
       
     count++;
     
        if(count % NUMBER_OF_LINES ==0){
            
            System.out.println(i+ " ");
        
        
        }
     
        else{
     
            System.out.print(i + " ");
          
     }
     }
       
    }
    
    
    System.out.println();
   }
}   
   
    
    
    
    
    

