/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class NqueenProblem {
    
    
    
    public static void main(String [] args)
    {
    
    // create a chess board of n by n square
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("State the value of N in this programme: ");
        int N = input.nextInt();
        
        /* create an 2d array for n by n matrix */
        
        int [][] board = new int[N][N];
    
        
       
         
        
    
    
  
  }
    

     public static boolean solveNQ(int [][]board, int col)
     {
         /*now this is terminationg condition a base case where the program stops when it finishes placing all the queens*/
      int N = board.length;
         if(col>=N){
         
             return true;
         } 
             /*consider the 1st column and try placing queen in all rows one by one*/ 
             
             for(int i =0 ; i <=N ; i++)   // i = row
             {
                 
                 if(isSafe(board,i, col,N))
                 {
                 
                 
                     board[i][col]=1;  // queen is placed in this first colum first row (0,0)
                     
                     /*recur to place the rest of the queens*/
                     
                    
                        if(solveNQ(board,col+1))
                        {
                         
                            board[i][col]=0;   // backtrack
                        
                        }
          
                 }    
                            
            }      
                 
            return true;
     }
  
  
  
    
    /**
     *
     * @param board
     * @param row
     * @param col
     * @param N
     * @return
     */
    @SuppressWarnings("empty-statement")
    public static boolean isSafe(int [][] board, int row, int col,int N)
    {
        
        /*check if queen can be placed in left side of row **/
        // as we donot need to check the right side because we are going to check it for another queen next time
        int i , j;
        
        for( i = 0; i < col; i++)
        {
        
            if(board[row][i]==1)   // 1 is denoting a queen if placed on the left side of the current placing queen returns false
             return false;
        
        }
        /*
        checks if the queen can be placed on upper diagonal
       */
        for(i = row, j = col; i>=0 && j>=0;i--, j--){
        
            
            if(board[i][j]==1) 
                
                return false;
                
            
            } 
     
        /*checks if the queen can be placed on the lower diagonal*/
        
        for(i = row, j =col; i<N   && j>=0; i++, j--)
        {
            if(board [i][j]== 1)
                return false;
            
            
        }
       
        return false;
    
    
    
    
    
    
    
    
}

 
}