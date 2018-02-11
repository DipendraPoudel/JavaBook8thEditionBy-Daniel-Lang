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
public class PassParameterbyValues {
    
    public static void main(String [] args){
      
        // initialize variables
        int times =3;
        System.out.println("Before the  call,"+"variable times"+times);
        // invoke nprintln method and display times
        nPrintln("welcome to Javae", times);
        System.out.println("after the the call"+"variable times"+ times);
  
    }
    public static void nPrintln(String message, int n){
    
    while(n>0){
        System.out.println("n="+ n);
        System.out.println(message);
        n--;
    }
    
    }
    
}
