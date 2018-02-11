/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;
/**
import java.util.Arrays;

/**
 *
 * @author dipendra
 
public class Ex616ExecutionTime {
    
    static final int SIZE = 10000000;
    
    public static void main(String []args)
    {
        int [] tenMillionArray = new int [SIZE];
        
        // generate random key and store in key variable
        
        int key = (int)(Math.random() *10000000);
        
        long startTime = System.currentTimeMillis();
        System.out.println("The execution time for linearsearch is "+ linearSearch(tenMillionArray,key));
        long endTime = System.currentTimeMillis();
        
        int executionTime  = (int)(endTime - startTime);
       
        System.out.println("The execution time for linearsearch is "+  executionTime);
        
        java.util.Arrays.sort(tenMillionArray);
        
        startTime = System.currentTimeMillis();
        System.out.println("The execution time for linearsearch is "+ BinarySearch(tenMillionArray,key));
        endTime = System.currentTimeMillis();
        
        int executionTimeB  = (int)(endTime - startTime);
             System.out.println("The execution time for Binary "+ executionTimeB);
    }
    
    // since for the binarySearch array needs to be sorted so we sort array now
    

    
    
    // generate random 10 millions integers between 1 to 10 million and key between 1 to 10 million
    
   public static int[] RandomArray(int [] array)
   {
       int random = (int)(Math.random()*10000000)+1;
       
       for(int i =0; i<array.length; i++)
           array[i] = random;
           
       return array;

   
   
   
   
   
 }
    
    
    public static int linearSearch(int [] array, int key)
    {
        for(int i =0; i<array.length; i++)
        {
            if(key == array[i])
                return i;
        }
    
        return -1;
    
    
    
    }
    
    public static int BinarySearch(int [] array, int key)
    {
        int low =0;
        int high = array.length-1;
        
        // use while loop
        while(high >=low)
        {
            int mid = (low + high)/2;
             if(key <array[mid])
                 high = mid -1;
            
             else if(key == array[mid])
                 return mid;
             
             else
                 low = mid -1;
        
        }
        return -low -1; // now high < low ,key not found
    }
    
    
    
    
}
*/

public class Ex616ExecutionTime{
    static final int SIZE = 100000;

    public static void main(String[] args) {

        int[] numbers = new int[SIZE];
        int key = (int)(Math.random() * SIZE);
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = (int)(Math.random() * SIZE);
        }

        long start = System.currentTimeMillis();
        int index = linearSearch(numbers, key);
        long finalTime = System.currentTimeMillis() - start;
        System.out.println("LinearSearch - Total time of search is: " + finalTime + " index = " + index);

        start = System.currentTimeMillis();
        System.out.println("Sorting array...");
        sort(numbers);
        System.out.println("Finished sorting.");
        int index2 = binarySearch(numbers, key);
        finalTime = System.currentTimeMillis() - start;
        System.out.println("BINARY - Total time of search is: " + finalTime+ " index = " + index2);


    }

    public static int[] sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int swapIndex = i;
            int low = numbers[i];
            for (int k = i + 1; k < numbers.length; k++) {

                if (low > numbers[k]) {
                    low = numbers[k];
                    swapIndex = k;
                }
            }
            if (swapIndex != i) {
               numbers[swapIndex] = numbers[i];
               numbers[i] = low;
            }

        }
        return numbers;
    }


    public static int linearSearch(int[] numbers, int key) {


        for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] == key) return i;
        }

        return -1;
    }
    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length;


        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > numbers[mid]) {

                low = mid + 1;

            } else if (key == numbers[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }

        return -low - 1;
    }


}