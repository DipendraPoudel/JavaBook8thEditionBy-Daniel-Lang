

/**
 *
 * @author dipendra{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class LowestScore {
    
    public static void main(String [] args){
    
        int score = 0 ;
        int numberOfstudents =0;
        int maxScore = 0;
        int lowestScore=  100;
        String maxName ="";
        String lowestScoreName = "";
    // prompt the user to enter the total number of students  
        Scanner input = new Scanner(System.in);
            System.out.println("Total number of Students");
            
            int numberOfStudents = input.nextInt();
            
            
   // set a for loop continution to display the number of students being entered
        
            // prompt user to enter the number of grades 
         for(int i = 0; i < numberOfStudents ; i++){
            System.out.print("Enter name and score of student (" + (i + 1)
            + "):");
        
            String name = input.next();
             score = input.nextInt();
            
         
       
             if (score > maxScore ){
                 
                  maxScore = score;
                  maxName = name;
           
             
             
             }
                 
                 
              if (score < lowestScore) {
                  
                  lowestScore = score;
                  lowestScoreName = name;
                 
             }
             
            
            
        }
    
        System.out.println("Name of the student: " + maxName +" with highestScore: " + maxScore );
            System.out.println("Name of the student: " + lowestScoreName+" with lowestScore" + lowestScore );
            
  
         
            
    }}
 
        
    
    
    
            
            
          
    
        
        
    
    
    
    
   
    
    
    
    
    
    


    

