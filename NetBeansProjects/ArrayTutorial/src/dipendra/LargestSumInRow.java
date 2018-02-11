/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendra;

/**
 * variable maxRow to track the sum of largest row
 * indexOfMaxrow variable to store the index of largest row after tracking the largest row
 * 
 *
 * @author dipendra
 */
public class LargestSumInRow {
    
    public static void main(String []args)
    {
    int[][] matrix = new int [6][7];
    
    int maxRow =0;
    int indexOfMaxRow = 0;
    
    // Get sum of first wor in the maxRow
    for(int col = 0; col<matrix[0].length; col++)
    {
        maxRow += matrix[0][col];
    }
    // now for each row compute is sum and update maxRow and indexOfMaxRow
    // since row[0] is computed we start from row[1] 
    
    for(int row = 1; row < matrix.length; row++)
    {
        int totalOfThisrow =0;
        for(int col =0 ; col< matrix[row].length; col++)
        {
         totalOfThisrow += matrix[row][col];
        
        }
    
        if(totalOfThisrow> maxRow)
        {
         maxRow = totalOfThisrow;
        indexOfMaxRow = row;
         
    }
    
    }
    
     System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
    
    
    
    
    
    }
    

