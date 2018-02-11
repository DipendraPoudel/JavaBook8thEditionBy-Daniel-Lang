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
public class FindLargest {
    
    public static void main (String [] args){
    
        int n = 0;
        
        while ((Math.pow(n, 3) < 15000)){
        
        n++;
    
    
     System.out.println("The largest number is \n"+ (n));   
        
    }
        n--;
        
        System.out.println("The largest number is "+ (n));
        System.out.println("The number is "+ Math.pow(n, 3));
    
    
    }
    
    
}
