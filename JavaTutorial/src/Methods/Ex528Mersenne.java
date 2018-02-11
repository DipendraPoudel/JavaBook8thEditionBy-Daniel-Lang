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
public class Ex528Mersenne {
 
public static void main(String args[]){
    System.out.print("P\t\t2^P-1");
    
    //int count =1;

    for(int p = 2 ;  p <=31; p++){
        int i = (int)(Math.pow(2 ,p)-1);
        
        if(isPrime(i)){
        
        }
        System.out.println( p +" " +"\t\t"+ i+" ");
  
         
    
    
    
    }
    

}    
    


public static boolean isPrime(int number){
    
    for(int divisor =2; divisor <= number/2 ; divisor++){
        if(number % divisor == 0) // if this is true its not prime so return false otherwise return true and this is prime
    
            return false;
    }
  
    return true;
}


}