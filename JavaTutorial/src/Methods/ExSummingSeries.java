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
public class ExSummingSeries {
    
    public static void main(String args[]){
    
        double value =0 ;
        
        System.out.println("i" + "\t\t"+ "m(i)");
        System.out.println("----------------------");
        nSum(2);
        
    }
    
    public static double nSum (int i ){
        
       // loop through i to 20 get number of i within that range
        double sum=0;
        for( i = 1; i <=20; i++){
            
          sum += (double)i/(i+1);
        
          System.out.println(i + " "+"\t\t" + sum + "\n");
    }
        return sum;
        
      
   
    
    
    }
}