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
public class Ex518MathSqrMethod {
    
    public static void main(String args[]){
    
    System.out.println("Number\t\tSqaureRoot");
    System.out.println("-----------------------------");
        
        
       int n = 20;
       print(n);
        
    
    }
    
    public static void print(int n){
        
        for(int i = 0; i<= n; i++){
           
            System.out.println( i+"  " +"\t\t"+ Math.sqrt(i)+ "  ");
        }
        
         // System.out.println();
        
    
    
    
    }
}
