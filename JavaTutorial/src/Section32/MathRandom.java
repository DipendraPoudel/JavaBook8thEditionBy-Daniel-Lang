/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

/**
 *
 * @author dipendra
 */
public class MathRandom {
    
    public static void main(String [] args){
     
        int i ;
        int j;
        int k;
        i = (int) (Math.random() * 20);
          
        j = 10 +(int)(Math.random() * 10);
        
        k = 10 +(int)(Math.random() *50);
       
        
        
        System.out.println("The invoke of math.random for random integer i such that is " + i);
        System.out.println("The invoke of math.random for random integer i such that 10< i<20 is " + j );
        System.out.println("the invoke of math.random for random integer i such that 10<i<50 is " + k);
    
    
    
    
    }
    
    
    
    
}
