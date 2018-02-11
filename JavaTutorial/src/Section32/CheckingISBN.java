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
public class CheckingISBN {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first 9 digits:");
        
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        int d4 = input.nextInt();
        int d5 = input.nextInt();
        int d6 = input.nextInt();
        int d7 = input.nextInt();
        int d8 = input.nextInt();
        int d9 = input.nextInt();
        
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 *5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
    
        System.out.println("The ISBN is "+ d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
                
        
                
        
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
