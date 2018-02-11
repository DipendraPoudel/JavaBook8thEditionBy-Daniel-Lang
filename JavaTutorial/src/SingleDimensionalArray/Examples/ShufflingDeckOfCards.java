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
public class ShufflingDeckOfCards {
    
    public static void main(String [] args)
    {
    // create String suit array to store suits and create String rank array to store ranks
        String [] suits = {"Spades","Diamond","Club","Hearts"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String [] deck = new String [52];
        
        // prints the deck of cards in sequence ie, on order
        for (int i = 0; i < deck.length; i++) {
            
            deck[i] = ranks[i %13] + " of "+ suits[i/13];
            
           // System.out.println(deck[i] + " ");
        }
        
        // shuffled the deck of cards
        
        for(int i = 0; i < deck.length; i++ ){
            Random random = new Random();
            int index = random.nextInt(52);
            
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        
        
        for(String u: deck)
            
        {
            System.out.println(u + " ");
            
            
        }
        
        }
    
    }
    

