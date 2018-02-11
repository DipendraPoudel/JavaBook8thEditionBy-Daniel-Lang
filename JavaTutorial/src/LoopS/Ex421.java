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
public class Ex421 {
    
    public static void main(String [] args){   //was missing static
        int j= 0;
        int sum =0;
        for(int i = 0; i < 10; i++){
        
            sum += i;
            
        if( i < j)
            System.out.println(i);
        
        else 
            System.out.println(j);
        }
    
        while(j < 10){
        j++;
        
        }
        do {
        
        j++;
        }
        while(j < 10);
    }
    
    
}
