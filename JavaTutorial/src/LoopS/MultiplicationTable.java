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
public class MultiplicationTable {
    
    public static void main(String [] args){
    
    // Display the table heading
        
        System.out.println("        Multiplication Table");   // prints the table title
        
        System.out.print("  ");
    
        for( int j = 1; j <=9 ; j++)
            System.out.print("   " + j);
        
        System.out.println("\n ------------------------------------------");
        
        // print a table body
           
        for(int i = 1; i <=9 ; i++){
            System.out.print (i  +" |");
        
            for(int j = 1; j <=9; j++){
                
                System.out.printf("%4d", i * j);
            
            }
            
            System.out.println();
        
        }
    
    
    
    
    }
}
    
    
    
    

