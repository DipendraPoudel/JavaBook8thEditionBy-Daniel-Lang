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
public class Ex4247 {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter an int value, the program exists if the input is 0");
    
    int data = input.nextInt();  
    int sum =0;
    int count =0;
    int negative =0;
    int positive =0;
    float average;
    
    while (data != 0){
        
        sum = sum +data;
      //  System.out.println("Enter an int value, the program exists if the input is 0:");
        data = input.nextInt();
        count++;
        if(data <0){
            negative++;
        
        
        }
        else {
            positive++;
        
        }
    }
    
    float avg = sum/count;
    
    System.out.println("The number of positives integers is " + positive +
            "\nThe number of negatives integers is" + negative +"\nThe sum is " + sum +"\nThe average is "+ avg);
    
    
    
    
    }
   }
