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
public class Ex530TwinPrimes {
    
    public static void main (String args[]){
        int start =1;
        int end = 50;
        
        nTwinPrime(start,end);
   
        
        
 }
 
    
    public static boolean isPrime(int number){
        
        for(int divisor = 2; divisor <=number/2; divisor++){
            
            if(number % divisor !=0)  // this true ,prime number
            
                return true;
        }
           return false;
        }
    
   
    
    public static void nTwinPrime(int start , int end){
        for(int i = start; i<=end -2; i++){
            int num1 = i;
            int num2 = i +2;
        
            if(isPrime(num2) && isPrime(num2)){
                System.out.println("("+num1 + ",  "+num2+ ")");
            
            
            }
       }
        
        
    
    
    
    
    
    }
    
    }
        
        
        
        
        

    
    
    
