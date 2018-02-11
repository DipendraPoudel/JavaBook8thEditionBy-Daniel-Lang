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
public class InitializeArrayWithInputValues {
    
    public static void main(String []args)
    {
     int [][] matrix = new int[10][10];
        
    Scanner input  = new Scanner(System.in);
    System.out.print("Enter" + matrix.length + "rows and "+ matrix[0].length + "columns");
    
     for(int row =0; row< matrix.length; row++)
    {
    
        for(int col = 0; col <matrix[row].length;col++)
        {
        
            matrix[row][col] = input.nextInt();
        
            
        }
    
    }
    
    
    }
    
}
    