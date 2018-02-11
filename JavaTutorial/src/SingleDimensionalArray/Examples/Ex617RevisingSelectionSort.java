/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Arrays;
import java.util.Scanner;

/**
 * this exercises sorts the largest elements in the array and swaps with the last number of the array 
 * @author dipendra
 */
public class Ex617RevisingSelectionSort {
    
    
    public static void main(String []args){
    
     double [] list = {8 ,9 ,10,5,6,7 ,3,2,1,4};
     selectionSort(list);
     
     System.out.println(Arrays.toString(list));
    }
    
    public static void selectionSort(double [] list){
    
    for(int i= list.length-1; i>=0
            ; i--){
        // find the max in the list[list ... list.lenght-1]
        
        double currentMax = list[i];
        int currentMaxIndex = i;
    
    
        for(int j = i-1; j>=0; j--){
           if(currentMax < list[j]){
               currentMax = list[j];
               currentMaxIndex =j;
           
           }
        }
    
        // swap the list[i] with list[currentMaxIndex] if necessary
        
        if(currentMaxIndex !=i){
            
            list[currentMaxIndex]= list[i];
            list[i] = currentMax;
        }
    }
    
    }
    
    
    
    
}
