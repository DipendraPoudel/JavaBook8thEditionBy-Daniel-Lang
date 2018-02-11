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
public class PrimeNumberMethod {
    public static void main(String [] args){
        System.out.println("The first 50 PrimeNumbers are \n");
        printPrimeNumbers(50);
    } // main method
    
    
    public static void printPrimeNumbers(int numberOfPrimes ){
        final int NUMBER_PER_LINES = 10;  // display 10 prime numbers per line
        int count =0;
        int number =2; // a number to be tested to be primes
      
    
    // repeatedly find the prime numbers
        
        while(count < numberOfPrimes){
        
            if(isPrime(number)){
                count++ ;  // increase the count 
                
            if( count  % NUMBER_PER_LINES ==0){
            
               System.out.printf("%-5s\n",number); 
               System.out.println();
            }
            else
                
                System.out.printf("%-5s",number );
            
            
            
            }   // line29
            
            number++; // this checks whether next number is prime 
            
        }   // while loop
            
           
        
        }   //printPrime method    
        
    
    
    
    
    public static boolean isPrime(int number){
        for(int divisor =2; divisor <= number/2; divisor++){
            if(number % divisor ==0){ // if true number is not prime
            
                return false;
        
            }
        
        }
        
    return true;
    }
    
    
    
}
