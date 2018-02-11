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
public class Ex4432 {
    
    public static void main(String [] args){
        
        
    
    
            
        for(int i =1; i<10; i++){
        
        int firstDigit = (int)(Math.random()*10);
        
            for(int j = 1; j< 10; j++ ){
                
               
                 int secondDigit =  (int)(Math.random()*10);
            
            
            
        
        
        
           while(firstDigit == secondDigit){
                
               secondDigit = (int)(Math.random()*10 );
            
            }
            
            System.out.println(firstDigit +""+ secondDigit);
            
            
            }}
        
        } 
        
    
    }
    
    

