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
public class FindingSmallestindexofLargestElement {
    public static void main(String args[]){
        double[] myList = {1,5,3,4,5,5};
    
        // store the max at index 0;
        
        double max = myList[0];
        // intialize the variable indexofmax to denote largest element
        int indexOfmax = 0;
        
        for(int i =0; i<myList.length; i++){
            if(myList[i]> max){
                max = myList[i];
                indexOfmax = i;
            
            
            }
        
        
        }
        
        System.out.println("max is"+ max);
        System.out.println("smallest index is"+ indexOfmax);
        
    
    
    
    
    }
    
    
}
