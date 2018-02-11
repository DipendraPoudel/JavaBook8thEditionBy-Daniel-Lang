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
public class Ex418PatternII {
    
    public static void main(String [] args){
    
     int rc = 6; // rc is variable to store number of rows
     
     int max = 6;  // max is variable that store max number of numbers which is 6 numbers for the first time 
     
     for(int i = 1 ; i <=6; i++){   // loop 1 for the printing six lines of rows
     
         for(int j = 6 ; j <= max; j++){
         
         
             System.out.print(j + " ");
             
         
         }
        max--;     // after printing the number j for the first time the loop being executed 
                    //it comes out the loop and gets decremented
     
     
         System.out.println();
     
     
     
     }
    
    
    
    
    
    
    
    
    
    }
}  
    
    
    
    

