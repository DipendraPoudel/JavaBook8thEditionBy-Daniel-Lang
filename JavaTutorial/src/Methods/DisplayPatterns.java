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
public class DisplayPatterns {
    
    public static void main(String [] args){
        
        int number = 3;
        displayPattern(number);
        
        
        
    
    
    }
    
    public static void displayPattern(int n){
        
        
        // print number of rows
        for(int row  = 1; row<= n;row++){
            
            // print space
            for(int i = row ; i< n; i++){
              
                System.out.print( "  ");
            
                
            }
              // print i
            for(int i = row; i >=1; i--){
                System.out.print(i + " ");
            
            }
               System.out.println();
        }
        
    
    
    }
    
    
}
