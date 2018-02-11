/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;
import java.io.*;

/**
 *
 * @author dipendra
 */
public class Employee {
    public String name;  // instance variable is visible for any child class
    
    private double salary; // this variable salary is visible in employee class only
    
    
    public Employee(String empName){  // name is local variable since it is used inside the method
        name = empName;
    
    
    }
    
    
    public class jbt{
    
    
    int i;     //class variable ,instance variable
    
    void method(){
    System.out.print("inside method");
    
    
    
    }
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
}
