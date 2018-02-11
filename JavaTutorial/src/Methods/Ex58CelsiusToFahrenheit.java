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
public class Ex58CelsiusToFahrenheit {
    
    
    public static void main(String [] args)
    {
        
        System.out.println("Celsius\t\tFahrenheit\t\tFahrenheit\t\t Celsius");
        
        // since celsius is printing 10 times decrementing so i decrements 
        // where as fahrenheit prints 10 times decrementing by 10 
        
        double celsius =40; double fahrenheit =120;
        
        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) 
        {
        System.out.println(celsius + "\t\t"+ celsiusToFahrenheit(celsius)  +"\t\t\t"+ fahrenheit+"\t\t\t"+ fahrenheitToCelsius(fahrenheit));
     
        }

    }
    
    
    public static double celsiusToFahrenheit(double celsius)
    {
        
        return(9.0/5.0)* celsius +32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit){
        
        return (5.0/9)* (fahrenheit -32);
       
    
    }
}
