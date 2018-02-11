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
public class PYramidTriangle {
    
    public static void main(String [] args){
        
        int rc = 5;
        int spaceCounter = 4;
        int starCounter =1;
        
        
        // for loops for printing 5 rows
        
        for( int i = 1; i <=rc ; i++){
        
        
        // print spaces
            for(int j = 1; j <=spaceCounter; j++){
            
            System.out.print ("  ");
            
            }
            
            for(int j = 1 ; j <=starCounter; j++){
                
                
               
            System.out.print("  *  ");
            
            }
        
           
        
         starCounter +=2;
         spaceCounter--;
         
         
        System.out.println();
        
        }
        
         
        
        
        
        
        
        
        
        
        
        
        
    }}