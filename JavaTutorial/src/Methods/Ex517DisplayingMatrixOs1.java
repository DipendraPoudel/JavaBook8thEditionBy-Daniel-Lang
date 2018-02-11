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
public class Ex517DisplayingMatrixOs1 {
    
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        printMatrix(n);
        
    
    }
    
     
    public static void printMatrix(int n){
       
        for(int i =1; i<=n ; i++){
            
            for(int j =1; j <=n; j++){
                
                System.out.print((int)(Math.random() *2)+ " ");
            
            
            }
        
            System.out.println();
        }
    }
}
        
             
       
    

