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
public class ConversionGramsToOunce {
    
    public static void main(String [] args){
    
    System.out.printf("Grams \t\t Ounces\n");
   
    
    // use while loop
    
    int gram = 1;
    while(gram <= 199){
   
        System.out.println(gram +"\t\t"+ gram * 0.035 );
      

      gram++;
    
    }
    
    
    
    
    
    
    
    }    
}
