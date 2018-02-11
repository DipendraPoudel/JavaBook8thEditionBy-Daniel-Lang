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

public class Ex63 
{
    
    public static void main(String [] args)
    {
       
        Scanner sc = new Scanner (System.in);
        
        int [] array = new int[100];
       
        
        System.out.println("Enter the number between 1 to 100 (Enter 0 to Stop)");
        for(int i = 0; i < array.length; i++ )
        {
            int a = sc.nextInt();
            array[a] +=a;
            if(a == 0)
                break;
        }
            
        for(int i =1; i< array.length; i++)
        {
        if (array[i] !=0)
        
            if(array[i]/i>1)
            {
                
                System.out.println(i + " occurs " + array[i]/i +" time");
            
            
            }
            else
            {
                System.out.println(i + " occurs " + array[i]/i + " times");
               
   
            }
        }    
    }
    }










