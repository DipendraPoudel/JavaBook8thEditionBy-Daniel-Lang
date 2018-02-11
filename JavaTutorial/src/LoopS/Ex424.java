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
public class Ex424 {
    
    public static void main(String []args){
    
        int x = 80000000;
        
        while (x > 0)
            x++;
        System.out.println("x is " + x);
    
    // it causes overflow because the variable assigned to be store is too large in size
    
    
    }
    
}
