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
public class Example1 {
    
    public static int sum(int i1, int i2){
        int sum =0;
        for(int i = i1; i<i2; i++){
            
            sum += i;
        }
       
        return sum;
    }
    public static void main(String [] args){
    
    System.out.println("The sum 1 to 10 is "+ sum(1,10));
     System.out.println("The sum 1 to 10 is "+ sum(20,30));
      System.out.println("The sum 1 to 10 is "+ sum(35,45));
            
    
}
}