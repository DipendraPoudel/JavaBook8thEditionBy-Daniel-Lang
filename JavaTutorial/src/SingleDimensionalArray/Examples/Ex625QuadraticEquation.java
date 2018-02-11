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
public class Ex625QuadraticEquation {
     
    static int  n = 3;
    
    public static void main(String []args)
    {
        double[] eqn = new double[n];
        double [] roots  = new double[n];
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a, b, and c :");
      
        for(int i =0; i < eqn.length; i++)
        
         eqn[i] = input.nextDouble();   // storing the coefficients of a, b, and d
         
          
        int rootNum = solveQuadratic(eqn, roots);  // pass the parameter and store it to rootNum variable
        
        if(rootNum ==0)
        
        System.out.println("There are no roots");
        
        
        else 
        
            printRoots(roots, rootNum);
            
        
    }
        
  
        
        
         
        
       
        

    
    
    
    
    public static int solveQuadratic(double []eqn, double [] roots)
    {
        
        double a  = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        
        
        double discriminant = b * b - 4.0 * a * c;
        
        
        
        if(discriminant >0.0)
        {
            roots[0]= (-b + Math.pow(discriminant,0.5))/(2.0 * a);
             roots[1] = (-b - Math.pow(discriminant, 0.5))/(2.0 * a);
             
             return 2;
        }     
             else if(discriminant  == 0.0)
             {
               roots[0]= -b /(2.0 * a);
             
             }
                     
        return 0;
    
    
    
    }

  
    private static void printRoots(double [] roots , int numberOfRoots)
    {
    
     for(int i  = 0; i < numberOfRoots; i++)
     {
         System.out.println("Root "+ (i +1) + "= " + roots[i]);
                 
     
     }
    
    
    }
    
    
    
}
