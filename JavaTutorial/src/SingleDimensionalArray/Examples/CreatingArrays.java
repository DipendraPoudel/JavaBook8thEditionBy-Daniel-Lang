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
public class CreatingArrays {
    
    public static void main(String args[]){
        
        // creating arrays 
        double [] myList = new double [10];
        
        
        // initialise  the arrays with input values from user
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< myList.length; i++){
            myList[i] = input.nextDouble();
        
        }
        // initialize arrays with random values between 0.0 to 100 , but less than 100
        
        for(int i = 0; i < myList.length; i++){
            myList[i]= Math.random() *100;
            
        
        }
    
        // Displaying arrays, we have to print each element in the array
        
        for(int i = 0; i< myList.length;i++){
            System.out.print(myList[i]+ "");
        
        
        }
    
    
    
    }
    
    
    
    
    
}
