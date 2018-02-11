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
public class NumberDivisibleby5 {
    
    public static void main(String [] args){
    
        // create a local variable count initially 0 and use for loop to get numbers in between 100 and 1000
        
        int count =1;
        
        
        for ( int i = 100 ; i <=1000 ; i++){
        
        // System.out.println(count);
            
            if(i % 5 == 0 && i % 6 == 0)
                
                
            System.out.println((count++ % 10 !=0)? i +"":i + "\n");
            
            
            
    
            
        }
    
    }
    
}
