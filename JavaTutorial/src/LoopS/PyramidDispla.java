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
public class PyramidDispla {
   public static void main(String [] args){
  System.out.print("Enter the number of lines:");
  Scanner input = new Scanner(System.in);
   
  //get the total number of lines n.
  int n = input.nextInt();
   
  //Loop through the lines from 1 to n
  for (int i = 1; i <= n; i++) {
      
      // printing spaces , 2 at a time from j = 1, j = n -i
      for(int j =1; j<=(n-i); j++){
      
         System.out.print("  ");
      
      }
      
      // printing number decrementally from line number j to 1
     for(int j = i ; j >=1 ; j--){
      
         System.out.print( j + " ");
      }
      
      // printing number incrementally from line 2 to j
      
      for(int j = 2 ; j <=i ; j++){
          
          System.out.print(j + " ");
      
   System.out.println();
      
      }
      
   }}

}