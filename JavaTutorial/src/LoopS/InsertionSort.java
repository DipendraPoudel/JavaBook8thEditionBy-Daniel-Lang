/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

/**
 *
 * @author dipendra
 */
public class InsertionSort {
    
    
    
    
    public static int[] InsertionSort(int [] list){
        int i , j, temp,key ;
  
        for( i = 1; i < list.length; i++){
            key = list[i]; //      // since the first element in the list is already sorted because there is no element to compare with it
                                    // so i initialised to key
            
            j = i-1;
            
            while( j >=0 && key <list[j]){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            
            }
        
        }
        
        
        
        
        return list;
    
    
    }
    
}
