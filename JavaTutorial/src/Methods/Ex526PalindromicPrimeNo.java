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
public class Ex526PalindromicPrimeNo {
    

  public static void main(String[] args) {
    int count = 1;

    for (int i = 2; true; i++) {
      // Display each number in five positions
      if (isPrime(i) && isPalindrome(i)) {
        System.out.print(i + " ");

        if (count % 10 == 0) {
          System.out.println();
        }

        if (count == 100) {
          break;
        }

        count++; // Increase count
      }
    }
}


public static boolean isPrime(int number){
    
    for(int divisor =2;  divisor <= number/2; divisor++){
        if(number % divisor == 0){ // if true no is not prime
        
            return false;
    }
    }
    
    return true;
    
}

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
        
       
   
        
           
         

}}