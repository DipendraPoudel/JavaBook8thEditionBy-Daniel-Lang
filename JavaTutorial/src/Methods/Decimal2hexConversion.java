/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Decimal2hexConversion {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the decimal for conversion to hexadecimal");
        int decimal  = input.nextInt();
        
        System.out.println("The hex number for decimal "+ decimal + " is "+decimalToHex(decimal) );
    }
    
    // method to convert decimal to hexadecimal
    
    public static String decimalToHex(int decimal){
     String hex = "";
    
    while(decimal !=0){
    int hexValue = decimal %16;
    hex = toHexChar(hexValue)+hex;
    decimal = decimal /16;
    }
    
    return hex;
    }  // 25
    
    public static char toHexChar(int hexValue){
        if(hexValue <=9 && hexValue>=0)
            return (char)(hexValue + '0');
            
        else
            return (char)(hexValue -10+ 'A');
            
     
    
    }
    
}
