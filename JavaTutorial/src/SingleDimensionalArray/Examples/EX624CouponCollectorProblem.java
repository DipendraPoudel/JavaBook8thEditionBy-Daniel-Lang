/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author dipendra
 */
public class EX624CouponCollectorProblem {
    
    static final int NUMBER_OF_SUITS = 4;          // Clubs, spades, diamond,hearts
    static final int NUMBER_OF_CARDS  = 13;       // A,2,3,4,5,6,7,8,9,10.J,Q,K
    
    
    public static void main (String [] args)        
    {
        int [] suitArray = new int[NUMBER_OF_SUITS];
        int [] cardsArray = new int[NUMBER_OF_CARDS];
        
        CCsimulation(suitArray, cardsArray);
            
    }

    
    
    
    public static void CCsimulation(int[] suitArray, int[] cardsArray)
    {
        
        String [] cardsPickedArray = new String[NUMBER_OF_SUITS];
        int picksCounter =0;
        
        while(isFilled(cardsPickedArray))
        {
            Random randomPick = new Random();
            int pickSuit = randomPick.nextInt(NUMBER_OF_SUITS);
            int pickCards = randomPick.nextInt(NUMBER_OF_CARDS);
            
            if(cardsPickedArray[pickSuit] == null)
            {  
                
                storeCards(pickSuit,pickCards, cardsPickedArray);
               
            
            }
            
             picksCounter++;
        }
        
        
        System.out.println(Arrays.toString(cardsPickedArray)+ "\n Number of CardsPicked  "+ picksCounter);
        
    }
    
    /*returns true as long as the cardsPickedArray is not filled as soon as it is filled with four cards it passes false*/

    public static boolean isFilled(String[] cardsPickedArray) {
        
        for( int i = 0; i< NUMBER_OF_SUITS; i++)
        { 
            
            if(cardsPickedArray[i]== null)
                return true;
        }
        return false;
        }

    

    /**
     *
     * @param pickSuit
     * @param pickCards
     * @param cardsPickedArray
    
     */
    
    
    public  static  void storeCards(int pickSuit, int pickCards, String [] cardsPickedArray) 
    {
     String cardName = "";   
     
         if(pickCards> 0 && pickCards < 10)
            
             cardName += ("" + pickCards+ " 0f ");
        
        
            else if(pickCards == 0)
                cardName += ("Ace 0f");
         
            else if(pickCards ==10)
                cardName +=("Jack of");
                
            else if(pickCards == 0)
                    cardName +=("Quuen of");
            
             else
                cardName +=("King of");
          
         
         if(pickSuit == 0)
             
             cardName += ("Diamond");
         else if(pickSuit == 1)
             
             cardName += ("Club");
          else if(pickSuit == 2)
             
             cardName += (" Hearts");
            if(pickSuit == 3)
             
             cardName += ("King");
            
            
            cardsPickedArray[pickSuit] = cardName;
             
    }     
         
    }   
    
    
    
    
    
    
    
    
    
    
    
    

