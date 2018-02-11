/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendra;

/**
 *
 * @author dipendra
 */
public class InitializeArrayswithRandomValues {
    public static void main (String []args){
     int[][]matrix = new int [5][5];
     
     for(int row = 0; row< matrix.length; row++)
     {
         for(int col = 0; col< matrix[row].length;col++)
         {
         
             matrix[row][col] = (int)(Math.random()  * 100);
         
         }
     }
     
   
    
    }
    
    
}
