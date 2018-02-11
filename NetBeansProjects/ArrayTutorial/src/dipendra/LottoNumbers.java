/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendra;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class LottoNumbers {
    
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        boolean [] isCovered = new boolean[99];  // default false ,create and initialize array
        
        // Read each number and mark its corresponding element covered
        
        int number = input.nextInt();  // read number
        
        while(number !=0){
            isCovered[number -1] =true;   // mark the number covered
            number = input.nextInt();     // read the next number
        
    }
        
        // check whether all covered
        
        boolean allCovered = true; // assume all covered initially
        
        for(int i =0; i<99; i++){
        
            if(!isCovered[i])
                allCovered = false;
            
            break;
       
        }
        
       // Display result
        
        if(allCovered)
            System.out.println("the tickets cover all numbers");
        
        else
            System.out.println("the ticket dont cover all numbers");
        
    

    }
    
    
}
