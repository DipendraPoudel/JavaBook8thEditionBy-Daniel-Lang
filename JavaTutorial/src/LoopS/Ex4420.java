
package LoopS;

public class Ex4420{

public static void main(String [] args){
     
    int limit = 1500;
    int NO_PER_LINES = 15;
    System.out.println("The Prime Numbers between 2 and "+ limit+ "are:");
    
    // loop through the numbers one by one
    int count =0;
    for(int i = 2 ; i<=1500 ; i++){
        
        boolean isPrime = true;
        
        // check the number is prime or not
        
        for(int j = 2; j< i; j++){
            
            if(i%j ==0){
                isPrime = false;
                break;
            
            
            }
        
        
        }
    
        if(isPrime){
         count++;
         
         if(count %  NO_PER_LINES  !=0){
         
             System.out.println( i);
         
         }
        
         else{
         
             
             
         System.out.print(i +  " ");
         
         }
        
        
        i++;
        }
    
            
    }
    
   
    
    





}
}






    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

