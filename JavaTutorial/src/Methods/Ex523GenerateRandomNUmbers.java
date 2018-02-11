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
public class Ex523GenerateRandomNUmbers {
    
    public static void main(String [] args){
    
        final int NUMBER_OF_CHARS = 50;
        final int CHARS_PER_LINES = 5;
        final int NUMBERS_OF_INTEGERS =50;
        final int INTEGERS_PER_LINES =5;
      
          
    // Print random 50 random characters between a to z ,5 char per line
    for(int i = 0; i< NUMBER_OF_CHARS; i++){
        char ch = getRandomlowerCharacter();
        //char chDigit = getRandomDigitCharacter();
        
        
        if((i + 1) % CHARS_PER_LINES == 0)
            //if((i+1) % DIGITS_PER_LINES ==0);
         
           System.out.println(ch +" ");
           
         else
         
            System.out.print(ch + " ");
    }          
           
    System.out.println("=========");
    
    
    // print random 50 random integers between 0 t0 9 ,5 int per line
     
    
    for(int j = 0; j< NUMBERS_OF_INTEGERS; j++){
        char integers = getRandomDigitCharacter();
     
        if((j + 1) % INTEGERS_PER_LINES ==0)
            
            System.out.println(integers+ " " );
            
            
        else
            System.out.print(integers + " ");
    
    }
        
        
    }
    

    // Generate a random number between character ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
       return (char)(ch1 + Math.random () * (ch2 -ch1 + 1));
     
    }
    public static char getRandomlowerCharacter(){
        
        return (char) getRandomCharacter('a', 'z');
    
    
    
    }
    public static char getRandomDigitCharacter(){
         return getRandomCharacter('0','9');
    
    }
    
    
    
}
