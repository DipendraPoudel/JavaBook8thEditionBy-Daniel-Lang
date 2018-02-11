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
public class AdditionQuizLoop {
    
    public static void main(String [] args){
    
    final int NUMBER_OF_QUESTION = 10;  // DECLARE THE CONSTANT for the number of questions that would be programme ask
    int correctCount =0; // count the correct answers
    int count =0;  // count the number of questions
    long startTime = System.currentTimeMillis();  // get the start time
    String output = ""; // output string is initially empty
    Scanner input = new Scanner(System.in);
    
    
    while(count < NUMBER_OF_QUESTION){
        
    // GENERATE TWO RANDOM single digits integers
        
        int number1 =(int)(Math.random() * 15) +1;  
        int number2 = (int)(Math.random() *15) +1;
   
    // prompt the student to answer "what is number 1 + number 2?
    
    System.out.println("What is "+ number1 +" + "+ number2 +"?");
    
    int answer = input.nextInt();
    
    // Grade the answer and display the result
    
    if(number1 + number2 == answer){
    
        System.out.println("You are correct!\n");
    
        correctCount++;
        
        
    }
    else
        
        System.out.println("You are wrong.\n" + number1 +" + "+ number2 + " should be "+ (number1 + number2)+"\n");
    //
    
    count++;
    
     output += "\n"+number1 + " + "+number2 + "="+ answer + ((number1 + number2== answer)?"correct":"wrong");
    
    
    }
   
    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;
    
    System.out.println("Correct Count is "+ correctCount + "\nTestTime is " + testTime /1000 +"seconds\n" + output);
    
    }}
    
    
    
    
    
    

