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
public class Ex419copy {
    
    public static void main(String [] args){
    
    // declaring variable to store number of rows 
        
        int rc = 6;  // since there are 6 rows rc store the numbers in rows
        int max = 6 ; // since there are max six numbers the max stores the 6 different numbers in it
        
        
        // using outer loop to print the  numbers of rows which is 6 in this case
        
        for(int i = 1; i<=6 ; i++){
               for (int j = 1 ; j<=max ; j++){
               
               System.out.print(j +" ");
               
                 // when the loops prints 6 different numbers in first row for the first time it gets out of the loop
               
                        //and decrements by 1 and prints 5 numbers in seconds line and so on
            
               }
               
               
               max--;
        System.out.println();   
            
               
        }
     
    
    
    
    }
    
    
    
    
    
    
    
}
