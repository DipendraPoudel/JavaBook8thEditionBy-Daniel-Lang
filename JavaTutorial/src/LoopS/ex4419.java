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
public class ex4419 {
    
    public static void main(String [] args){
    int spaceCounter=7;
    int odd = 1;
        
    // printing the number of rows
    for(int i =1;i<=8; i++){
        // printing the space
        
        for(int j = spaceCounter; j>=1;j--){
            
            System.out.print("  ");
 
        
        }
          
       
     for(int j = 1; j<=odd; j*=2){
         
         
      
         
     System.out.print(j + " ");    
         
         
       
     }
    
        System.out.println();
        odd *=2;
       
        
        spaceCounter--;
    }
    
    }
    
    
    }