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
public class Ex418III {
    
    public static void main(String [] args){
    // loop 1 for printing the new line 
  
        for(int i = 1 ; i <=6; i++){   
            // printing the spaces 
            for(int j = 6-i ; j>=1; j-- ){
            
                System.out.print("  ");
            }
            for(int j =i; j>=1; j-- ){
        
                System.out.print(j +" ");
              
        
            }
        
        System.out.println();
             }
 
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
}
