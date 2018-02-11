/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author dipendra
 */
public class BinarySearch {
    // use binary search to find the key in the the list
    
    
    public static int binarySearch(int [] list , int key){
        int low = 0;
        int high =list.length-1;
        
        while (high>=low){
            int mid = (low + high)/2;
            if(key < list[mid])
                high = mid -1;
            
            else if (key == list[mid])
                return mid;
            
            else
                low =  mid +1;
            
        
        
        }
        return -low-1;  // now high < low , key not found
    
    
    }
    
    
    
}
