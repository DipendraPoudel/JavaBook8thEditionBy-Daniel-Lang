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
public class Ex511ComputingComission {
    
    public static void main(String []args){
        
        System.out.println("Sales Amount\t\t Commission");
        for(double amount =10000; amount <=100000; amount+=5000){
            
            System.out.println(amount + "  " + "\t\t "+computeCommission(amount));
        
        
        
            
        
        }
    
            
        
        
        
        
    }
    
    
    public static double computeCommission(double salesAmount){
        // compute the rate for  range of 0.001 to  50000
        
        double commision =0;
        
        if(salesAmount >=0.01 && salesAmount<=5000){
        
            commision = salesAmount * 0.08  ;
            
        }
        
        else if(salesAmount >=5000.01 && salesAmount <= 10000){
            commision = (5000 * 0.08) + ((salesAmount - 5000) * 0.1);
        
        
        }
        
        else {
            commision = (5000 * 0.08 ) + (5000 * 0.1) +((salesAmount -10000) * 0.12);
        
        
        }
        return ((int)commision * 10/10.0);
    }
   
    
}
    
    

