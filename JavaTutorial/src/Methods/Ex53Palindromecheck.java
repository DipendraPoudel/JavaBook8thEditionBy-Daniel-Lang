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
public class Ex53Palindromecheck {
          
    public static int reverse(int number){
        int remainder;
        int sum = 0;
     
        while( number > 0){
            remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number/10;
            
            
            
        
        
        }
    
      // return sum; 
              
        return sum;
        
      
    }
    
   
    
    public static boolean isPalindrome(int number){
      
    
      return number == reverse(number);
        
       
   
        
           
         
    
    

    
    }
    }  