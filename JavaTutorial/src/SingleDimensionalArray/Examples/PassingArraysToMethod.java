/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

/**
 *
 * @author dipendra
 */
public class PassingArraysToMethod {
    
    public static void main(String args[]){
        int x =1;  // represents int value
        int [] y = new int[10]; // y represents an array of int values
        
        // invoke m with arguments x and y
        
        m(x,y);
    
    
      System.out.println("x is "+ x);
      System.out.println("Y [0] is"+ y[0]);
    
    }
    
    public static void m(int number, int [] numbers){
    
        number = 1001; // assign a new value to numbers
        numbers[0] = 5555; // assign a new value to numbers[0]
        
    }
    
    
}
