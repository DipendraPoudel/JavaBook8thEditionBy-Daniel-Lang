/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class ConvertApp{

public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in celsius");
    
    double celsius = input.nextDouble();
    
    double fahrenheit = (9.0/5)* celsius +32;
    
    System.out.println(celsius +"Celsius is"+ fahrenheit);
    
    




}










}
