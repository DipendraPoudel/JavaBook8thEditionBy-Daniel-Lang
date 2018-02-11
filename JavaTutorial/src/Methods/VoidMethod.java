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
public class VoidMethod {
    public static void main(String [] args){
    
        System.out.print("The grade is:");
        
        printGrade(70.5);
        System.out.print("The grade is:");

        printGrade(90.5);
        
} // main method
    
    
    public static void printGrade(double score){
        
        if(score >= 90.0){
            System.out.println('A');
            
        }
    
        else if(score >=80.0){
             System.out.println('B');
        
        }
        
        else if(score >=70.0){
             System.out.println('C');
            
        
        }
        else {
             System.out.println('F');
            
            
            
        
        }
            
            
    
    }
    
    
}
