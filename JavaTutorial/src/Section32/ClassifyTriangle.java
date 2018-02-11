/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class ClassifyTriangle {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the three sides (doubles):");
        
        
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        
        boolean isValidInput = (x+ y > z && x +z > y) && y+z >x;
        
        if((isValidInput == true) &&(x == y && y == z && z == x )){
    
         //if(x == y && y == z && z == x ){
             
          System.out.println("Those sides from equilateral triangle");
      
          //if( (x == y && y ==z ) && !( z == x))
             
           // System.out.println("Those sides from isosceles");
          
       
        }
          
              
        else if( (isValidInput ==true) && ((x == y || y ==z ) && (!( z == x) || !(z == y)))){
             
            System.out.println("Those sides from isosceles");
          
            
            }
        else if((isValidInput == true) && ((!(x == y) && !(y == z)) || !(z== x))){
        
            System.out.println("Those sides from scalene ");
        
        
        }
        
        
        else{
        
        System.out.println("Invalid input");
        
        }
        
    }}
     
    
     
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

   
