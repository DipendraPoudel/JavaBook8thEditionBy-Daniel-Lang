/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Pyramid {
    
    public static void main(String [] args){
    

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many Rows you want in Your Pyramid?");
        
        int noOfRows =  input.nextInt();
        
        // intializing row count 1
        
        int rowCount = 1;
        System.out.println("Here is your Pyramid");
    
        for(int  i = noOfRows ; i > 0; i--){
            
            // printing i spaces at the beginng of each row
           
            
            for(int j = 1 ; j <= i; j++){
            
            System.out.print(" ");
           
            }
        
            for(int j = 1; j <=rowCount; j++){
            
            System.out.print(rowCount + " ");
            }
            System.out.println();
            
            // incrementing row count
            rowCount++;
            
        }
     
    }}
