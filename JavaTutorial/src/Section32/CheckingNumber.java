/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class CheckingNumber {
    
    public static void main(String []args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        
        int n = s.nextInt();
        
        if( n % 3 == 0 ||n % 4 ==0){
            
            System.out.println( n +" is divisible by 3 or 4 but not both");
            
    
    
    }
        
        
        
    
    
    
    }
    
    
    
    
}
