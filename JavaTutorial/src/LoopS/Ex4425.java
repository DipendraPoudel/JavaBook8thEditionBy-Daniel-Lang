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
public class Ex4425 {
    
    public static void main(String [] args){
    
    double sequenceFormula = 0;
    
    for( int i = 1; i<=100000; i+=2){
        
        sequenceFormula = sequenceFormula + (((1/2.0 * i -1.0) -(1/2 *i + 1.0)));
        
        double PI  = 4 * sequenceFormula;
    
                if (i == 10000 
                    || i == 20000 
                    || i == 30000 
                    || i == 40000 
                    || i == 50000
                    || i == 60000 
                    || i == 70000 
                    || i == 80000 
                    || i == 90000 
                    || i == 100000);
    
    
        System.out.println("The value of Pi for :" + i +"is\t =" + PI  );
    } 
    }
   }
