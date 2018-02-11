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
public class ComputingTUitionFee {
    
    public static void main(String [] args){
    
     double initialTuitionfee = 10000;
     final double increaseRate =0.05;
     double tInfourthYears = 0;
     
     for(int i = 1; i <=10; i++){
         
         initialTuitionfee = (initialTuitionfee * 0.05) + initialTuitionfee;
         
    
         System.out.printf("Year " + i +" tuition fee is "+ "%10.2f\n",initialTuitionfee);
     
     }
     
        
     for(int i = 11 ; i <=15; i++){
     
         
       tInfourthYears += initialTuitionfee ;
     
         initialTuitionfee *= 0.05;
      
         
         
        System.out.printf("Year " +i+ " tuition fee is "+ "%10.2f\n",tInfourthYears);
     
     
     }
     
        System.out.printf("Year   tuition fee is "+ "%10.2f\n",tInfourthYears);
     
     
    }
     
     }
        
        
        
        
    
    
    
    
    

