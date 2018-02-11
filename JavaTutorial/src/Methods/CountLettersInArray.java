/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author dipendra
 */
public class CountLettersInArray {
    public static void main(String []args){
        //Declare  and create an array
        char[] chars = createArray();
        
        // Display the array
        
        System.out.println("The lowercase letters are");
        displayArray(chars);
        
        //count the occurences of each letter
        int[] counts = countLetters(chars);
        
        // Display the counts
        System.out.println();
        System.out.println("The occurences of each letter are");
        displayCounts(counts);
      
    }
    public  static char[] createArray() {
       // declare array and create array
        
        char [] chars = new char[100];
        
        // Create lowercae  letters randomly and assign
        // them to the array
        
        for(int i =0; i< chars.length; i++){
            chars[i] = RandomCharacter.getRandomLowercase();
              
        }
        
        // return the array
    
         return chars;
    }
    
    // Display the array of characters
    
    public static void displayArray(char [] chars){
        
        // Display array character in the array 20 on each line
        for(int i =0; i< chars.length; i++){
            
            if((i + 1) % 20 ==0)
                System.out.println(chars[i]);
            
                else
                     System.out.print(chars[i]+ " ");
        
        
        }
    }   
        //Count the occurences of each letter
        
    public static int[] countLetters(char[] chars){
        
        // Declare and create an array of 26 int
        
        int [] counts = new int[26];
        
        for(int i = 0; i <chars.length; i++){
            
            counts[chars[i]-'a']++;
     
        }
    return counts;
   
    }
    
   // Display Counts
    
    public static void displayCounts(int[] counts){
        for(int i = 0; i<counts.length; i++ ){
            if((i +1) %10 ==0)
                System.out.println(counts[i]+" " + (char)(i+'a'));
            
                else
                    System.out.print(counts[i]+ " "+(char)(i+'a'));
            
        
        
        }
    
    
    
    }
    



}
    
    
