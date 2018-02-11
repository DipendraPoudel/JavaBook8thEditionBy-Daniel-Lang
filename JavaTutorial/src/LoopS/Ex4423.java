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
public class Ex4423 {
    
    public static void main(String [] args){
    
    double lSum =0.0;
    double rSum =0.0;
    double difference=0.0;
     
    for(int i =1; i<=50000; i++){
    
        lSum += 1.0/i;
        
      
    }
           
    System.out.println("The results form lef to right is "+lSum);
    
    for(int j = 50000; j>=1; j--){
    
        rSum += 1.0/j;
    
        
    
    }
    difference = rSum - lSum;
    
    System.out.println("The results from right to lef is " +rSum);
    
    System.out.println("The difference is  " +difference);
    
    
    
    }
}
