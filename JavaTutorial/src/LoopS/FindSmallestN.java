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
public class FindSmallestN {
    
    public static void main(String [] args){
    
    int n = 1;
    
    while ( Math.pow(n ,2)  < 15000){
    
    n++;
    
    }
      
        System.out.println(n + " is the lowest number, such that n^2 is greater than 15,000");
        System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
        System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));
        
      
    }   
}
