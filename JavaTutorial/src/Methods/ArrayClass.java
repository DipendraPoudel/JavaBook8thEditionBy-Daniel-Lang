/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Arrays;

/**
 *
 * @author dipendra
 */
public class ArrayClass {
    
    public static void main(String args[]){
        
        int index;
        char [] vowels = {'a','u','i','e','o'};
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        
            for(char el: vowels){

                index = Arrays.binarySearch(vowels, el);
                
                System.out.printf("%c...%d%n",el,index);

        }
    
    
    
    
    
    }
    
    
}
