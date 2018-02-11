/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex512DisplayCharacters {
    
    
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lowercase:");
      
        char ch   = input.next().charAt(0);
        
       
        
        
        printUppercase(ch);
       
    }
    
    
    public static void printUppercase(char lowercase){
     
        if(lowercase > 97){
        
        System.out.println("The uppercase is "+(char)('A'+(lowercase-'a')));
        }
    
        
        else {
        
            System.out.println("The character you entered is not lowercase.Try again! ");
        
        }
    }  
}
