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
public class GameScissor{

public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
 
   System.out.print("scissor (0), rock (1), paper (2):");
   int user = s.nextInt();
   int computer = (int)(Math.random() * 3);
  
     
   
   
   if(computer == 0) {
 System.out.print("The computer is scissor.");
   } else if(computer == 1) {
 System.out.print("The computer is rock.");
   } else if(computer == 2) {
   System.out.print("The computer is paper.");
   }
  
   if((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1)) {
 if(user == 0) {
  System.out.print(" You are scissor. You won.");
 } else if(user == 1) {
  System.out.print(" You are rock. You won.");
 } else if(user == 2) {
  System.out.print(" You are paper. You won.");
 }
   } else if(user == computer) {
 if(user == 0) {
  System.out.print(" You are scissor too. It is a draw.");
 } else if(user == 1) {
  System.out.print(" You are rock too. It is a draw.");
 } else if(user == 2) {
  System.out.print(" You are paper too. It is a draw.");
 }
   } else {
 if(user == 0) {
  System.out.print(" You are scissor. You lose.");
 } else if(user == 1) {
  System.out.print(" You are rock. You lose.");
 } else if(user == 2) {
  System.out.print(" You are paper. You lose.");
 }

 else if(user > 2){
   
  System.out.println(" User have Invalid Input.Please try again");
 
 
 }
   }
}
                
}    
            
            
            
        
        
        
        
        
        
        

    
    
    
    

