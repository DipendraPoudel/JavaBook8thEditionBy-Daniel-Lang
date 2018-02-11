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
public class TestMax {
    
    public static void main(String [] args){
    
    //int i = 5;
    //int j =2;
    
   // int k = Max(5 ,2);
    
    System.out.println("The maximum is "+ Max(5,2));
    
    }
    
    public static int Max(int num1, int num2){
        int result;
        
        if(num1 > num2){
        result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    
}
