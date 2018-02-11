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
public class ForLoopsExamples {
    
    public static void main(String [] args){
        
        
        int noOfSpaces =5;
        
        // printing the number of rows i
   
        for(int i = 1; i<=6; i++){
        
            
        // printing the leading spaces
            for(int j = noOfSpaces; j>=1; j--){
            
                
                System.out.print(" ");
              
            }
            
           //printing the j and characters in it
            // notice in the structure when j equals i it stops printing the characters in it or stops printing columns
            // thats why j<=i so to get required pattern we print i instead of j
            
            for(int j= 1; j<=i; j++){
            
            System.out.print(i+ " ");
            }
           
        System.out.println();
        
        noOfSpaces--;
        
        }}}
    
    
