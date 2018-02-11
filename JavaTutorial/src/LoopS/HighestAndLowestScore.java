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
public class HighestAndLowestScore {
    
    public static void main(String [] args){
    
        Scanner input = new Scanner(System.in);
    
        System.out.println("Total number of Students");
   
        int tNumberStudents = input.nextInt();
        
        int maxScore = 0;
        int secondMaxScore =0;
        String maxName ="";
        String secondMaxName = "";
        
        for(int i = 0; i < tNumberStudents ; i++){
            System.out.print("Enter name and score of student (" + (i + 1)
            + "):");
        
            String name = input.next();
            int score = input.nextInt();
            
            
            if(score > maxScore){
              secondMaxScore = maxScore;
              secondMaxName = maxName;
               maxScore = score;
               maxName = name;
            
            }
            
            else if(score > secondMaxScore){
            
                    secondMaxScore = score;
                    secondMaxName = name;
            
            }
            
            
        }
        
            System.out.println("Name of the student: " + maxName +" with highestScore: " + maxScore );
            System.out.println("Name of the student: " + secondMaxName +" with second highestScore" + secondMaxScore );
            
  
         
            
    }}
 
        
    
    
    
            
            
          
    
        
        
    
    
    
    
   
    
    
    
    
    
    

