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
public class SummingAllElementsByColumn {
    
    public static void main(String []args)
    {
       int[][] matrix = new int [10][10];
   for (int column = 0; column < matrix[0].length; column++) { int total = 0;
           for (int[] matrix1 : matrix) {    // each row (ie matrix1)inside matrix array print each row and add 
               total += matrix1[column];
           }
             System.out.println("Sum for column " + column + " is " +total);
        }}}