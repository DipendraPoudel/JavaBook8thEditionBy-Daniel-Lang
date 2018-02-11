/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

/**
 *
 * @author dipendra
 */
public class EightQueensProb {
    
    public static void main(String [] args)
    {
    
    
    }
      /*checks if the ith queen can be placed in jth column*/
        
    public static boolean isSafe(int k,int j, int[]Queen)
    {
        /*see if (k,j) is a possible position*/
        /*check the jth column*/
        
        for(int i =0; i<k; i++)
        {
            if(Queen[i]==j)
            {
                return false;
        
            }
        }
        /*check the major diagonal*/
        
        for(int row = k -1, column = j-1; row>=0 && column >=0; row--,column--)
        {
        
        if(Queen[row] == column)
        {
        
            return false;
        }
        
        }
        
        return true;
    
    
    
    }
    
    
}
