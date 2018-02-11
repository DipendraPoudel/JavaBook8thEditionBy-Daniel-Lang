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
public class Ex515PrintingTaxTable {
    static int j;
    static int income;
    public static void main(String args[]){
        
        System.out.println("Taxable Income\t\tSingle\t\t\t\tMarried Joint\t\t\tMarried Separate\tHead of House");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        
        for(int i = 50000;  i<= 60000; i+=50 ){
        
           income = i;
            
            for(int j = 0; j <4; j++){
                
           
             System.out.print(income +  " "+"\t\t\t"+ (computetax(j,i)));
            
            
        }
            
           System.out.println();
                
        }
    }
    
    public static double computetax(int status ,double taxableIncome){
       
        double tax = 0; // initialize local variable
        
        if(status == 0){
            
            if(taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            
            else if(taxableIncome <= 33950)
                tax = 8350 * 0.10 +(taxableIncome - 8350) * 0.15;
        
        
            else if (taxableIncome <=82250)
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +(taxableIncome -33950) * 0.25;
            
            else if (taxableIncome <=171550)
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 82250-33950) * 0.25 +(taxableIncome -82550) * 0.28;
            
            else if (taxableIncome  <= 372950)
                
                tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 8250-33950) * 0.25 +(171550 -82550) * 0.28 + (taxableIncome - 171550) * 0.35;         
        
        
             else 
           
                  
            tax = 8350 * 0.10 + (33950-8350) * 0.15 +( 82250-33950) * 0.25 +(171550 -82550) * 0.28 
                     + (372950 - 171550) * 0.33 +(taxableIncome- 372950)* 0.35;    
            
        }
            else if  (status == 1){
              
            if(taxableIncome <=16700)
                tax = taxableIncome * 0.10;
            
            else if(taxableIncome <= 67900)
                
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;   
                
                
            else if(taxableIncome <=137050)   
                tax = 16700 * 0.10 +(67900-16700)*0.15 +(taxableIncome -67900) * 0.25;
            
            
            else if(taxableIncome <=208850)
                tax = 16700 * 0.10 +(67900-16700) * 0.15 +(137051 -67900) * 0.25 + (taxableIncome -137050)*28 ;
            
            else if(taxableIncome <=372950)
                
                tax = 16700 * 0.10 +(67900-16700)*0.15 + (137051 -67900) * 0.25 + (137050 - 208850)* 0.28 +(taxableIncome - 137050) * 0.33;
                
            
         
                
            else 
                tax = 16700 * 0.10 +(67900-16700)*0.15 + (137051 -67900) * 0.25 
                        + (137050 - 208850)* 0.28 +( 372950- 208850) * 0.33 +(taxableIncome -372950) *0.35;
                               
                
                }      
            
                
                
        else if (status == 2){
            
            if(taxableIncome <=8350)
                tax = 8350 * 0.10;
            
            else if(taxableIncome <=33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            
            else if(taxableIncome <= 68525)
                
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (taxableIncome - 33950) * 0.25;
                
            
            else if(taxableIncome<=104425 ) 
                
                 tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 +(taxableIncome -104225) * 0.28;
                
            
            
            else if(taxableIncome <=186475)
                
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 + (186475-68525) * 0.28 + 
                        (taxableIncome - 68525) * 0.33;
            
            else 
                tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (68525 - 33951) * 0.25 + (186475-68525) * 0.28 + 
                        (104426 - 186475) * 0.33 + (taxableIncome - 18475) * 0.35;
            
                
                }
                
                
        else if( status ==3){
                
            
            if(taxableIncome <= 11950 )
                
                tax = 11950 * 0.10;
            
            else if(taxableIncome <= 45500)
                
                tax = 11950 * 0.10 +( taxableIncome-11950) * 0.15;
            
            
            else if (taxableIncome <=117450)
                
                tax = 11950 * 0.10 + (45500 -11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            
            else if (taxableIncome <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 -45500) * 0.25 + (taxableIncome- 117450) * 0.28;
            
            else if (taxableIncome <= 372950)
                
                 tax = 11950 * 0.10 +(45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +(taxableIncome -190200);
            
            
          
            else 
                tax = 11950 * 0.10 +(45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.33 + (taxableIncome -372950);
                
                
                
                }
      
        
        
        return Math.rint(tax) ;
        
    
    
    
    }
    
    
    
}
