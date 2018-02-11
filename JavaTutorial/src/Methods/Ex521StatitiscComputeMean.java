/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex521StatitiscComputeMean {
    
    
    public static void main(String args[]){
        double number;
        double mean;
        double deviation;
        deviation = mean =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        
        // for loop through to get 10 different number and add their sum to compute average and mean
        for(int i =1; i<=10; i++){
          number = input.nextDouble();
          mean += number;
          deviation += Math.pow(number, 2);
           
        }
        deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
        mean /= 10;

        
         System.out.println("The mean of the given numbers is: "+ mean);
         
         System.out.printf("The mean of the given numbers is %.5f\n ", deviation);
         
        
        
        
       
    
    }
   }
