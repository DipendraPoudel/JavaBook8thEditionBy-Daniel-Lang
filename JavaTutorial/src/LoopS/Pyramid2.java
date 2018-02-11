
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dipendra
 */
public class Pyramid2 {
    
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many rows in pyramid?");
    
    int noOfrows = input.nextInt();
    int rowCount = 1;
    
    
    for(int i = noOfrows; i >0 ; i--){
        
        // print j spaces at the front of each rows
        
        for(int j = 1 ; j <= i ;j++){
        
        System.out.print(" " );
        
        }
    
        for(int j = 1; j <=rowCount; j++ ){
        
            System.out.print( j + " ");
        
        
        }
    
        System.out.println();
        rowCount++;
        
    
    
    
    
    
    }
    
    
    
        
    
    
    }
    
    
    
}
