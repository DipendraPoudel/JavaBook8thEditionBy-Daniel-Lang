/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;


/**
 *
 * @author dipendra
 */
public class Ex433ScissorROckGame {
    
    public static void main(String [] args){
        
        int count = 0;
        
        while(count <=2 || count<=-2){
            
            // generate random number scissor , rock , paper
            
            int computerNum = (int )(Math.random() * 3);
            
            // prompt the user scissor , rock , paper 
            
            java.util.Scanner input = new java.util.Scanner(System.in);
            
            System.out.println("Scissor (0), rock(1), Paper(2)");
            
            int userNumber = input.nextInt();
            
            // check the guess
            
            switch(computerNum){
                
                case 0: if(userNumber ==0){
                        System.out.println("Its draw:");

                        }
                        else if(userNumber == 1){
                            System.out.println("You won");

                            count++;
                        }

                        else if(userNumber == 2){
                            System.out.println("You lost");
                            count--;
                        }
                        break;
                
                case 1: if(userNumber == 0){
                            System.out.println("You lost");
                            count--;
                        }
                        else if(userNumber == 1){

                                System.out.println("Its draw");

                                }
                        else if(userNumber ==2){
                                System.out.println("You won");

                                count++;
                                }
                                break;
                    
                case 2:if(userNumber == 0){
                            System.out.println("You won");
                            count++;

                            }
                            else if(userNumber == 1){
                            System.out.println("You lost");
                            count--;

                            }

                            else if(userNumber == 2){
                            System.out.println("Its draw");

                            }

                            break;
                
             }  // switch statement
            
            } // line 20 while loop braces
            
        
            if(count >3){
                
                System.out.println("You wont three times");
            }
            else {  
                System.out.println("Computer three times");
            
            }
}
                
}
