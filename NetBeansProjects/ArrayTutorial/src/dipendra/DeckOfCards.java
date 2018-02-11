/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendra;

/**
 *
 * @author dipendra
 */
public class DeckOfCards {
    public static void main(String args[]){
    
    int [] deck = new int[52]; // create array deck 
    String [] suits = {"Spades","Hearts","Diamonds","Clubs"};  // create array of string for suit
    String [] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};  // create array of string for ranks
    
    
    // initialize cards
    
    for(int i = 0; i<deck.length;i++){
        deck[i]=i;  // assign values to deck 
    }
    // shuffle the cards
    
    for(int i =0; i<deck.length; i++){
        // generate the index randomly
        
        int index = (int)(Math.random() * deck.length);
        int temp = deck[i];     // temp variable holds the deck to shuffle later we use it to assign it to deck with new index
        deck[i] = deck[index];
        deck[index] = temp;
        
        
        
    
    }
    
    // Display the first four cards
    
    for(int i = 0; i< 4; i++){
        String suit = suits[deck[i]/13];     // suit of card
        String rank = ranks[deck[i] % 13];    // rank of a card
        System.out.println("Card Number " + deck[i] + " : " + rank +" of "+ suit);
    
    
    }
    
    
    
    }
    
    
    
}
