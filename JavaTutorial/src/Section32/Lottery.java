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
public class Lottery {
    
    public static void main(String [] args){
    
    // generate a  lotter   
    int lottery = (int )(Math.random() * 999) + 2;  // this methods generates random lottery number ranges from 100 to 1000 
    
  
    System.out.println("The lottery number is " + lottery);
        
    //prompt the user to enter a guess of three digits
  
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter your lottery pick (three digits):");
    
    int guess = input.nextInt();
    
    
    // Get a digits from lottery
    
    int lotteryDigit1 = lottery /100;
    int lotteryDigit2 = (lottery %100)/10;
    int lotteryDigit3 = lottery  %10;
  
    
  // get the digits from guess input
    
    int guessDigit1 = guess /100;
    int guessDigit2 = (guess %100) / 10;
    int guessDigit3 = guess % 10;
    
    
        if(guess == lottery){
        
            System.out.println("Your wining amount is  $10000.00");
        
        }
        
            else if((guessDigit1 == lotteryDigit1|| guessDigit1 == lotteryDigit2||guessDigit1== lotteryDigit3)
               &&(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) 
                && (guessDigit3 == lotteryDigit1)   
                || (guessDigit3 == lotteryDigit2)
                || (guessDigit3 == lotteryDigit3)){
            
                 
                System.out.println("Your wining amount is $ 3000.00");
    }
               else if ((guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3)
            || (guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3)
            || (guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3))   
            System.out.println("Match one digit: you win $1,000");

        else
            System.out.println("Sorry, no match.Try Again");
        
      
        
        
        
                
        
        
        
        
}}