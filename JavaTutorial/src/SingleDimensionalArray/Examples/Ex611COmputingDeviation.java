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
public class Ex611COmputingDeviation
{
    public static void main(String []args)       
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ten numbers");
        double []numbers = new double [10];
        for(int i =0; i<numbers.length; i++)
        {
            double num = input.nextDouble();
            numbers[i] =  num;
            
         
        
        }
        System.out.println("The mean is " +(int) mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers)) ;
 
        
    }
    public static double deviation(double []x)
    {
        double mean = mean(x);
        double sumsq =0;
        for(int i =0; i <x.length; i++)
        {
            sumsq += Math.pow(x[i]- mean,2);
        
        
        }
        
            return Math.sqrt(sumsq/(x.length-1));
        

    
    }
    
    public static double mean(double[]x)
    {
        
        double sum =0;
        for(int i =0; i<x.length; i++)
        {
            sum += x[i];
            
        }
        
        System.out.println(sum);
        
        return sum/x.length;
    
    
    
    
    
    }
    
    
    
    
}
