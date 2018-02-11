/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex62ReversingTheNumber {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner (System.in);

    int [] numbers = new int[10];
    
    // read the number
    for(int i = 0; i<10; i++){
        // Read a number
      System.out.print(
        "Read a number");
        numbers[i]= input.nextInt();
    
    
    }
        for(int i =9 ; i>=0; i--){
            
            
            System.out.println(numbers[i]);
        
        }
     
    
    }
    
    
}
