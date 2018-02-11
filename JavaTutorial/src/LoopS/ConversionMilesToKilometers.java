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
public class ConversionMilesToKilometers {
    
    public static void main(String [] args){
    
    System.out.printf("Miles \t\tKilometers\n");
    
    int miles = 1;
    
    // use while loop
    
    while( miles <=10){
        System.out.println(miles +"\t\t"+  miles * 1.609);
        
        miles++;
    
    
    }
    
    
    
}
}