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
public class Payroll {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the Employee Name:");
        
        String name = input.next();
          System.out.println("Enter the numbers of hours worked:");
             double hoursWorked = input.nextDouble();
            System.out.println("Enter hourly pay Rate:");
            double hourlyRate = input.nextDouble();
              System.out.println("Enter federal tax withholding rate:");
                double fTax = input.nextDouble();
        
        
              
                 double GrossPay = hoursWorked * hourlyRate ;
                 double fWithHoldTax = GrossPay * 20.0/100.0;
                 double sTaxholdTax = GrossPay * 0.09;
                 double totalTaxDeduction = fWithHoldTax + sTaxholdTax;
                 double NetPay = GrossPay - totalTaxDeduction;
                 
                 
                 System.out.println("Enter state tax witholding rate:" );
                 
                 System.out.println("Employee Name:" + name);
                 
                 System.out.println("Hours Worked:" + hoursWorked);
                 
                 System.out.println("Pay Rate:" +hourlyRate);
                
                 System.out.println("Gross Pay :"+ GrossPay);
                 
                 System.out.println("Deductions:");
                 
                 System.out.println("Federal Withholding (20.0%):"+ fWithHoldTax );
                 System.out.println("State Withholding (9.0%):"+ (int) (sTaxholdTax *100)/100.0 );
                 System.out.println("Total Deductions:"+ (int)(totalTaxDeduction *100)/100.0);
                 System.out.println("Net Pay:"+(int) (NetPay*100)/100.0);
                 
                 
                 
                 
                 
    
    
    
    
    
    
    
    }
    
    
    
    
}
