/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Random;

/**
 *
 * @author dipendra
 */
public class Ex629BlackJac {


    
    public static void main(String [] args)
    {
        
        int [] FourCardsArray = new int[4];
        int sum = pickCards( FourCardsArray );
    
      while(sum !=24)
          sum = pickCards(FourCardsArray);
        if(sum ==24)
        {
            display( FourCardsArray );
            
            
        }
        else
        {
            System.out.println("You got a sum of "+ sum);
            
        }
      }
    
    
    
    
    
    
    
    public static void display(int[]  FourCardsArray ) 
    {
        System.out.println("You got a sum of 24");
        
       for(int i = 0; i <  FourCardsArray .length; i++)
       {
          if( FourCardsArray [i] == 1){
              System.out.println("Ace");
          }
          else if( FourCardsArray [i] == 13){
                       System.out.println("King");
          }
                  else if( FourCardsArray [i] == 12){
                       System.out.println("Queen");}
                  else if( FourCardsArray [i] == 11){
                       System.out.println("Jack");}
                  else{
                      System.out.print(FourCardsArray[i] + " ");
                   
                  }
                      
          
           
       }
        
        
    }
    
    /*picks randomly two cards out of 52 cards*/
    
    
    public static int pickCards(int[]  FourCardsArray ) 
           
    {
        Random random = new Random();
        int sum =0;
        
        for(int i =0; i <  FourCardsArray.length; i++)
        {
            FourCardsArray [i] = random.nextInt(13);
           sum +=  FourCardsArray [i];
        
        }
        
         return sum;
    
        
        
        
    }
    
    
    
} 
    
