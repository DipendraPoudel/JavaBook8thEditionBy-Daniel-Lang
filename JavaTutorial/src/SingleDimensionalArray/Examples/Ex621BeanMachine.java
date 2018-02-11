/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex621BeanMachine {
    
    
    public static void main(String []args)
    {
        
    
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Enter the number of balls and slots number in the machine:");
            
            beanMachineSimulation(input.nextInt(), input.nextInt());
        }
        
        
    }

    public  static void beanMachineSimulation(int numberOfBalls, int numberOfSlots) {
        
        char [] positionArray = new char[numberOfSlots -1];   // array to store position that drop falls through
        int [] ballPosition = new int [numberOfSlots];
        for(int i = 0; i < numberOfBalls; i++)
        {
        
        dropPosition(positionArray);
        storePosition(positionArray,ballPosition);
        displayArray(positionArray);
        
        }
        
        
        System.out.println(Arrays.toString(ballPosition));
           
                
        displayBallPosition (ballPosition);
         
    }
    
    // display all the position where all the balls have landed
    public static void displayBallPosition(int [] ballPosition)
    {
    
        int maxHB = findMaxH(ballPosition);
        
        for(int i = maxHB ; i >0 ; i--)
        {
            for(int j = 0 ; j<= ballPosition.length;j++)
            {
                if(i == ballPosition[j])
                {
                 System.out.printf(" %-2d ", 0);
                    ballPosition[j]--;
                }
                
                else
                    System.out.printf("%-2s" , " ");
           
                
            }
        
        
        
        }
    
    
    
    }
    
    
    public static int findMaxH(int[] ballPosition) 
    {
        
        int maxHB = 0;
        
        for(int i =0; i < ballPosition.length;i++)
        {
            if(maxHB <ballPosition[i])
                maxHB = ballPosition[i];
            
             
     
        
         }
            return maxHB;
        
        }
    
    

    
    
    
  // this method fills char array with L or R
    public static void dropPosition(char[] positionArray) {
        
        Random randomLR = new Random();
        for(int i =0; i <positionArray.length; i++)
        {
        
          if(randomLR.nextBoolean() == true)
              positionArray[i] ='R';
          
          else
              positionArray[i] ='L';
        
        
        }
        
    }
// display each element in the array
    public static void displayArray(char[] positionArray) {
        
        System.out.println(Arrays.toString(positionArray));
        
        
        
    }
  // this method will store the slot position where ball is landed
 
        
        
        
    

    public static void storePosition(char[] positionArray, int[] ballPosition)
    {
        int midPosition = (positionArray.length+ 1)/2;
        
            System.out.println("Position"+ midPosition);
        
            for(int i = 0; i <positionArray.length; i++)
            
                if(positionArray[i] =='L'  && midPosition >0)
                   midPosition--;
                
                    else if(midPosition <=positionArray.length)
                         midPosition++;
                
                
                         ballPosition [midPosition]++;
           }
        
         
        
    }


    
    

        
        
    
    
    
    
    
    
    
    
    

