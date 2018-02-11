package LoopS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dipendra
 */
public class Pattern1 {
    
    public static void main(String [] args){
   
   int rc =6;
       int starCounter =6;
    
    for(int i = 1; i<=rc ; i++){
        
        
        System.out.println();
        
        // printing star  as the number of colum is depend on number of rows
        for( int j = 1 ; j<=starCounter; j++){
         
    
        System.out.print("*");
            
        }
        
       starCounter--;
      
    }
     
    
    }
    
    
    
    
}
