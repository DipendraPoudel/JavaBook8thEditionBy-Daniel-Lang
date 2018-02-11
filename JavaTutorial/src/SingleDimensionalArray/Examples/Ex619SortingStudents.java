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
public class Ex619SortingStudents 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Student:");
        int numOfStudents = input.nextInt();
        String [] names = new String [numOfStudents];
        
        int [] arrayScore = new int [numOfStudents];
        
        for(int i =0; i < numOfStudents; i++)
        {
            System.out.print("Enter the student's name:");
            names[i] = input.next();
            System.out.print("Enter the student "+names[i]+ " score:");
            arrayScore[i] = input.nextInt();
        
        }
        SelectionSort(arrayScore);
        System.out.println("The sorted list would be:"+Arrays.toString(arrayScore) );
        
    
    }
    public static void SelectionSort(int[]array)
    {
       /// find the smallest score and display it in increasing order so
        // outer loop runs from 0 to length of array
        
        for(int i =0; i< array.length-1; i++)
        {
         double minValue = array[i];
         int minIndex = i;
         
        
         
         for(int j =i +1; j< array.length; j++)
         {
         
             if(minValue > array[i])
             {
                  minValue = array[i];
                    minIndex = j;
             
         
         
             }
         }
        
        // swap array[i] with array[minIndex] if necessary
         if(minIndex !=i)
         {
         array[minIndex] = array[i];
         array[i]= minIndex;
          
         
         }
         
         
       
        
        }
    }
    
    
}
