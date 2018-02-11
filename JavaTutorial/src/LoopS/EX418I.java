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
public class EX418I {
    
    public static void main(String [] args){
    
        int rc =6;
        int max =1; // max is variable for the max number to store which is 1 first time the loop executed
        
        // loop around to print the five rows
        
        for(int i = 1; i <= rc ; i++ ){
        
         // loop to print the number ,numbertimes  and increment by 1 each time when the each row is printed 
        
            for(int j = 1 ; j<=max; j++){
            
            System.out.print(j + " ");
            
            }
            max++;
    
         System.out.println();
        }
    }
} 
    
    
    
    
    

