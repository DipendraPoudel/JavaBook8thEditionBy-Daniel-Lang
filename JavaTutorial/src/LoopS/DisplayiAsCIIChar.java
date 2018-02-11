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
public class DisplayiAsCIIChar {
    
    public static void main(String [] args){
        
   
     int count = 1;   
        
    for ( int i = 33 ; i <= 126; i++)    {
    
        
    
  
    System.out.println((count++ %10 !=0)?(char)i + "": (char)i +"\n");
            
   
        
        
        
}
}
}