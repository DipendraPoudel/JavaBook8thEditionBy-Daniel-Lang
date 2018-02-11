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
public class RandomShuffling {
    
    public static void main(String []args)
    {
    
    int [][] matrix = new int [5][5];
    
    // for matrix[i][j] randomly generates indices i1 and j1 and swap matrix[i][j] with matrix[i1][j1]
    
    for(int i = 0; i < matrix.length; i++)
    {
      for(int j = 0 ; j< matrix[i].length; j++)
      {
      
      int i1 = (int)(Math.random() * matrix.length);
      int j1 = (int)(Math.random() * matrix.length);
      
      int temp = matrix[i][j];
      matrix[i][j] = matrix[i1][j1];
      matrix[i1][j1] = temp;
      
      }
    
    
    }
    
    
    
    
    
    
    
    
    }
    
    
}
