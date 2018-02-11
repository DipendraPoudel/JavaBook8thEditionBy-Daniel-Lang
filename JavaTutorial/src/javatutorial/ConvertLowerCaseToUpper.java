/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class ConvertLowerCaseToUpper {
    
    public static void main(String []args){
    
        System.out.println("Enter ASCII code only:");
        
        Scanner input = new Scanner (System.in);
       String asciCode = input.next();
       int code =  Integer.parseInt(asciCode);
       
       System.out.println("the character for ascii code  is"+ code +"is\t"+(char)code);
        
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
}
