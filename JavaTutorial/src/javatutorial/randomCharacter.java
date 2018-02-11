/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

public class randomCharacter {
public static void main(String []args) {

long random = (System.currentTimeMillis() %25) + 65;

char randomchar = (char)random; 

System.out.println(randomchar);
	}
}
    
    
    
    
    