/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex613RandomNumberChooser {
    
    static  final int SIZE = 10;
    public static void main(String [] args)
    {
        // create initialize array for storing number to be excluded
        // suppose in this case we are excluding 10 numbers out of given range
        
        int [] excludeNumbers = new int [SIZE];
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the ten numbers to be exclude :");
            for(int i =0; i<SIZE ;i++)
            {
                int num = input.nextInt();
                excludeNumbers[i] = num;
            }
        }
        System.out.println("The random number is "+ getRandom(excludeNumbers));
    }
    


    public static int getRandom(int ...numbers){
        
       
       int random =(int) (Math.random()*100) + 1;
       for(int i = 0; i < numbers.length; i++){
           if(random == numbers[i]){
              random = (int)(Math.random() * 100 +1);
              i = -1;
           
           }
        }
        return random;
    
    }
}


