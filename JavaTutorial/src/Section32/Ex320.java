/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

/**
 *
 * @author dipendra
 */
public class Ex320 {
    public static void main(String []args){
        
        java.util.Scanner input = new java.util.Scanner(System.in);
         
        System.out.println("Enter the numbers:");
                
        
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        
        
        System.out.println("(x<y && y<z)is "+ (x<y && y<z) );
        
        System.out.println("(x<y || y<z)is "+ (x<y || y<z) );
        
        System.out.println("!(x<y)is "+ !(x<y) );
        
        System.out.println("(x+y <z)is "+ (x+y<z) );
        
        System.out.println("(x+y <z)is "+ (x+y<z) );
        
        // 3.24
        
        double weight = 51;
        double height = 161;
        
        System.out.println( weight>50 || height >160);
        
        
        
        
        
    
    
    
    
    
    
    
    
    }
    
    
    
    
}
