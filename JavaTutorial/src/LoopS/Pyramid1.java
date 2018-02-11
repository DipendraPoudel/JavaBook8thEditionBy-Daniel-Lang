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
public class Pyramid1 {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
        
    System.out.println("How many rows in Pyramid?");    
    
    int noOfrows = input.nextInt();
    
    
    // initializing the rowCount
    
    int rowCount = 1;
    
    for(int i = noOfrows ; i >0; i--){
        
        //printing the  spaces j infront of each row j
        
        for(int j = 1; j <=i ; j++){
        
        System.out.print(" ");
        
        }
    
    // printing the rowCount ,rowCount times at the end of eachrow
        
        for(int j =1 ; j<=rowCount ; j++){
        System.out.print(rowCount + " ");
        
        }
        
    
    
        System.out.println();
        rowCount++;
        
        
    }
    
    
    
    
    
    
    }
 }
