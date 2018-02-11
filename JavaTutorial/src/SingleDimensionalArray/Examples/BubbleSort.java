/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;

/**
 *
 * @author dipendra
 */
public class BubbleSort {
    
    public static void main(String [] args){
        int [] array = {6,8 ,9,5 ,4,2};
    
        System.out.println("The sorted array by BubbleSort method is"+ Arrays.toString(BubbleSort(array)));
    
    }
    
    
    
    public static int[] BubbleSort(int [] list){
    
        
        // the first loops runs from 0 to length of array
        // suppose if the list items are 5 the loop runs from 0 to 4 and on the 5 index the swapped element be set 
    for( int i =0; i< list.length-1; i++){
        // then it enters into the second loop
        // where j is 1 and runs from 1 to
    
        for(int j =0; j< list.length-1; j++ ){
        
            if(list[j]> list[j+1])
            {
             int temp = list[j];
             list[j]= list[j+1];
             list[j+1]= temp;
            
            
            }
        
        
        
        }
    
    
    
    }
        return list;
    
    
    
    }
    
}
