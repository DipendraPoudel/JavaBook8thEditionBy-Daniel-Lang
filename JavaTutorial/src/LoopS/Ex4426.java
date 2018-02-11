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
public class Ex4426 {
    
    public static void main(String [] args){
        
        double e = 1;
        double item =1;
        
        for( int i =1; i <=100000; i++){
            
          item = (double)item/i;
          
          e +=item;
          
          if(i % 10000 == 0){
          
        /*  
         if (i == 10000 || i == 20000 || i == 30000 || i == 40000 ||
          i == 50000 || i == 60000 || i == 70000 || i == 80000 ||
          i == 90000 || i == 100000) */
        System.out.println("The e is " + e + " for i = " + i);
        }
        }
     }
 }
