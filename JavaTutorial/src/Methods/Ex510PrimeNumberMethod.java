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
public class Ex510PrimeNumberMethod {
    
    public static void main(String args[]){
    
        // generate number 1 to 1000
        for(int i =1; i<=10000; i++){
            int number =i;
            
            if(isPrime(number)){
                
                
            System.out.println(number+ " ");
            }
            
        
        
        }
       
        
        
    
    
    }
    
    
    
    public static boolean isPrime(int number){
        
        for(int divisor =2; divisor <=number/2; divisor++){
            if(number % divisor ==0) // if this is true ,number is not prime
        
       
        return false;
        }
    
       return true;  // if the number is prime return true
    
    
    }
}

