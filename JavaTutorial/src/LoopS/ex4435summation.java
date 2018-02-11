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
public class ex4435summation {
    public static void main(String [] args){
        
      
        double sum = 1/(1+Math.sqrt(2.0));   // first one is different than others
        
        for(int i= 2; i<=624; i++){
            
            double next = 1/(Math.sqrt(i)+ Math.sqrt(i+1));
            sum += next;
        
        
            
        }
    
    
    
        System.out.println("The sum of the given equation is "+ (int)(sum * 100)/100.0);
    }
    
    
}
