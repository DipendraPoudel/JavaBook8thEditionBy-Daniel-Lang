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
public class SelectionSort {
    
    public static void main(String [] args)
    {
    
    
    }
    
    public static int selectionSort(int [] list)
    
    {
        int i,j, minIndex,temp, minValue =0;
        
        for (i =0; i< list.length;i ++)
        {
            minValue = list[i];     // initialize the first minvalue and index for Minvalue for first unsorted items in array
            minIndex = i;
            
            
            for(  j =i; j< list.length; j++)
            {
                if(list[j]<minValue)
                {
                    minValue = list[j];
                    minIndex = j;
                
                }
            
            
            
            }
        
        } // first outre loop
        return 0;
        
    
    
    
    }
}
