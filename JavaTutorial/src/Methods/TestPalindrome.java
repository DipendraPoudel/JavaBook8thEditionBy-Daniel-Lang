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
public class TestPalindrome {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the integer to check if this is Palindrome or not:");
        int palindromeValue = input.nextInt();
        //System.out.println(Ex53Palindromecheck.isPalindrome(palindromeValue));
       
        
        if(Ex53Palindromecheck.isPalindrome(palindromeValue))
        
            System.out.println("The given number is a Palindrome.");
        
        
        
        else
            System.out.println("The given number is not a Palindrome.");
        
    
    
    
    
    
    }
    
    
    
}
