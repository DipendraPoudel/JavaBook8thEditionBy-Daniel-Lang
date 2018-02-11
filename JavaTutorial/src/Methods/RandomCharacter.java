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

    // generate a random character between ch1 and ch2
public class RandomCharacter {
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2-ch1+1));
        
    
    }
    
    public static  char getRandomLowercase(){
        return getRandomCharacter('a', 'z');
        
    
    }
    
    public static  char getRandomUppercase(){
        return getRandomCharacter('A', 'Z');
        
    }
    
    
    
    public static int getRandomDigitCharacter(){
         return getRandomCharacter('0','9');
    
    }
    
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
    

    
    public static void main(String [] args){
    
     final int NUMBER_OF_CHARS = 175;
     final int CHARS_PER_LINES = 25;
     
    for(int i = 0; i<= NUMBER_OF_CHARS; i++){
        
        char ch = getRandomUppercase();
        
        if((i+1) % CHARS_PER_LINES ==0)
            
        System.out.println(ch );
     
        else
            System.out.print(ch + " ");
    
    }
    
    
    
    }
}
    

