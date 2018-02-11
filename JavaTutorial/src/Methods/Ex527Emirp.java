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
public class Ex527Emirp {
    public static void main(String args[]){
        int count =1;
        
        for(int i = 2; true; i++){
          if(isPrime(i) &&  isEmirp(i)){
          
              System.out.print(i+ " ");
          
              if(count % 10 ==0){
                  System.out.println();
                  
              }
              
                if(count == 100){
                    break;
                
                }
                count++;
          }
            
        
        
        }
    
    
    
    }
public static int reverse(int number){
    
    int remainder =0;
    int sum =0;
    
    // this loop terminates when n becomes 0 when keep calculating sum 
    while(number >0){
        
        remainder = number % 10;
        number = number/10;
        sum = sum * 10 + remainder;
    }
    return sum;
}

public static boolean isPrime(int number){
        
    for(int divisor =2; divisor <= number/2; divisor++){
    
        if(number % divisor == 0) // it this this true ,itnot prime 
            
    return false;
     
    }
    return true;    
    }


public static boolean isEmirp(int number){
    
        return(isPrime(number) && isPrime(reverse(number)) );
          
          
          
          


          
}



}