/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

/**
 *
 * @author dipendra
 */
public class PickingCardGame {
    
    public static void main(String [] args){
    
        // generate the range of number 1 to 13 for the rank of cards
        
        int rank = (int)(Math.random()*13+1);
        
        // generate the range of number 1 to 4 to display the suit
        
        int suit = (int)(Math.random()* 4 +1);
        
        
        String rankValue = "";
        String suitValue = "";
        
        System.out.println(rank);
        System.out.println(suit);
        
        
        switch (rank){
        
            case 1 : rankValue = "Ace";
                break;
                
            case 2 : rankValue = "2";
                break;
            
             case 3 : rankValue = "3";
                break;
                 
             case 4 : rankValue = "4";
                break;
                 
             case 5 : rankValue = "5";
                break;
                 
             case 6 : rankValue = "6";
                break;
                 
             case 7 : rankValue = "7";
                break;
                 
             case 8 : rankValue = "9";
                break;
                 
             case 10 : rankValue = "10";
                break;
                 
             case 11 : rankValue = "Jack";
                break;
                 
             case 12 : rankValue = "Queen";
                break;
                 
             case 13 : rankValue = "King";
                break;
            
            
            
        
        
        }
    
        
        switch (suit){
    
        case 1: suitValue = "Clubs";
        
        break;
    
        case 2: suitValue = "Diamonds";
        
        break; 
            
            
        case 3: suitValue = "Hearts";
        
        break;
            
            
         case 4: suitValue = "Spades";
        
        break;    
        
    
    
    
    
    }
    
    System.out.println("The card you picked is "+ rankValue +" of "+ suitValue);
        
        
    
    }
    
}
