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
public class Ex433 {
   
    public static void main(String [] args){
        
        int sum =0; // declare the sum variable and initialize to 0 later we use this variable
        
        // for loop to generate number between 1 to 100000
   
        for(int i = 1; i <=10000; i++){
           // second loop to find the divisor for every number in the range
            for(int j =1; j <= i/2; j++){     
                // check if the for each number the remainder is 0 when divide by 2 and every iteration when 2 increments by 1 and so on
                
                if(i % j== 0){
                    // if remainder is zero add all the divisor and assign to sum variable
                    sum += j;
                }
                
               } // second loop
           // this IF statements checks if sum of all divisor  equals to it for each numbers between the range
            // come out of the second loop and can check the numbers between range
                if(sum == i){
                    System.out.println("The perfect number between 1 and 10000 are " + sum);
                
                
            }
            
                    sum =0;   // after each inner loop sum becomes 0 and again starts checking the next number in range
                    
            
        
        
        }// first loop 
     
    
        
    }   // main method

} // class
        
          
    

    
                 
     
