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
public class WindChillTemperature {
    
   public static void main(String []args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature greater than 41F and not below -58F in Fahrenheit:");
    
    // variable v store the double temperature entered by user
    
    double temp= input.nextDouble();
    
    System.out.println("Enter the wind speed  greater than 2 miles per hour:");
    
    double windS = input.nextDouble();  // variable v stores the speed of wind entered by user
    
    // variable twc stores the outside calculated temperature 
    double finalTemp =35.74 + (0.6215 *temp)- 35.75*Math.pow(windS,0.16)+ 0.4257*temp* Math.pow(windS, 0.16);
    
   
    
   
    
    
    boolean ValidTemp = ( temp <= -58)  && !(temp <= 41);
    boolean ValidWind = (windS >= 2) ||!(windS < 2);
            
    
    if((ValidTemp == true ) && (ValidWind == true)){
    
        System.out.println("The wind chill index is"+(int)(finalTemp *10000)/10000.0 );
    }     
     
    
    else if((ValidTemp == true ) && (ValidWind == false)){
    
        System.out.println("Valid temperature and inValid wind.Try Again");
    
    }
   
    else if((ValidTemp == false) && (ValidWind == true)){
            
        System.out.println("Invalid Temp and Valid wind");
                
    
    }
    
    else{
    
        System.out.println("Invalid Temperature and Invalid Wind.Please try Valid temperature and Valid wind");
    
    }
    
    
  
    
        
        
    
    
    
   }
}
