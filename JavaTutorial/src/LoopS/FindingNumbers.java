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
public class FindingNumbers {
    
    public static void main(String [] args){
    
        int count = 1;
        
        for(int i = 100; i <=200 ; i++){
        
          if( i % 5 == 0 || i % 6 == 0)  
              
            
          System.out.println((count++ % 10 !=0)?i +  "" : i + "\n");
              
              
              
        
        
        }
    
    
    
    }
    
    
    
    
}
