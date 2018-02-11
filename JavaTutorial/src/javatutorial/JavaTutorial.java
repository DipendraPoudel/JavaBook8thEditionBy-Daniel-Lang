/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author dipendra
 */
public class JavaTutorial {

    /**
     * @param args the command line arguments
     */
    
    public void pupyAge(){ 
        int age = 0; // local variable is declared inside the method ,initial value should be given before first use.
                        // local variable is destroyed once the method is exits
        
        age = age + 7;
        System.out.println("puppy age is"+ age);
    }
    
   
    public static void main(String[] args) {
     JavaTutorial jt = new JavaTutorial();
     
     jt.pupyAge();
        
        }
    
}
