/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section32;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class FinancialAppComputeTax {
    
    public static void main(String []args){
    
    // create a scanner objet
        Scanner input = new Scanner (System.in);
    
        // prompt the user to enter the filing status
        
        System.out.println("(O - single filer , 1 married jointly,\n "
                +"2 married seaparately  , 3 -head of household)\n"
                +"Enter the filing status:\n");
        
        int status = input.nextInt();
        
        
        // prompt the user to enter the taxable income
        
        System.out.println("Ente the taxable income");
        
        double income = input.nextDouble();
        
        // compute tax
        
        double tax = 0; // initialize local variable
        
        if(status == 0){
            
            if(income <= 8350)
                tax = income * 0.10;
            
            else if(income <= 33950)
                tax = 8350 * 0.10 +(income - 8350) * 0.15;
        
        
            else if (income <=82250)
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +(income -33950) * 0.25;
            
            else if (income <=171550)
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 82250-33950) * 0.25 +(income -82550) * 0.28;
            
            else if (income  <= 372950)
                
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 8250-33950) * 0.25 +(171550 -82550) * 0.28 + (income - 171550) * 0.35;         
        
        
             else 
           
                  
            tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 82250-33950) * 0.25 +(171550 -82550) * 0.28 
                     + (372950 - 171550) * 0.33 +(income- 372950)* 0.35;    
            
        }
            else if  (status == 1){
              
            if(income <=16700)
                tax = income * 0.10;
            
            else if(income <= 67900)
                
                tax = 16700 * 0.10 + (income - 16700) * 0.15;   
                
                
            else if(income <=137050)   
                tax = 16700 * 0.10 +(67900-16700)*0.15 +(income -67900) * 0.25;
            
            
            else if(income <=208850)
                tax = 16700 * 0.10 +(67900-16700) * 0.15 +(137051 -67900) * 0.25 + (income -137050)*28 ;
            
            else if(income <=372950)
                
                tax = 16700 * 0.10 +(67900-16700)*0.15 + (137051 -67900) * 0.25 + (137050 - 208850)* 0.28 +(income - 137050) * 0.33;
                
            
         
                
            else 
                tax = 16700 * 0.10 +(67900-16700)*0.15 + (137051 -67900) * 0.25 
                        + (137050 - 208850)* 0.28 +( 372950- 208850) * 0.33 +(income -372950) *0.35;
                               
                
                }      
            
                
                
        else if (status == 2){
            
            if(income <=8350)
                tax = 8350 * 0.10;
            
            else if(income <=33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            
            else if(income <= 68525)
                
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (income - 33950) * 0.25;
                
            
            else if(income <=104425 ) 
                
                 tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 +(income -104225) * 0.28;
                
            
            
            else if(income <=186475)
                
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 + (186475-68525) * 0.28 + 
                        
                        (income - 68525) * 0.33;
            
            else 
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 + (186475-68525) * 0.28 + 
                        (104426 - 186475) * 0.33 + (income - 18475) * 0.35;
            
                
                }
                
                
        else if( status ==3){
                
            
            if(income <= 11950 )
                
                tax = 11950 * 0.10;
            
            else if(income <= 45500)
                
                tax = 11950 * 0.10 +( income-11950) * 0.15;
            
            
            else if (income <=117450)
                
                tax = 11950 * 0.10 + (45500 -11950) * 0.15 + (income - 45500) * 0.25;
            
            else if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 -45500) * 0.25 + (income - 117450) * 0.28;
            
            else if (income <= 372950)
                
                 tax = 11950 * 0.10 +(45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +(income -190200);
            
            
          
            else 
                tax = 11950 * 0.10 +(45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.33 + (income -372950);
                
                
                
                }
        
        
                else {
                
                System.out.println("Error:Invalid Status:");
                
                System.exit(0);
                }
                
                System.out.println("The tax is " + (int)(tax * 100 )/100.0);
                
                
                
                
               
        
    
    }
    
    
}
