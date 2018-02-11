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
public class Ex59ConversionInchesToCentimeters {
    
    public static void main(String []args){
        System.out.println("Inches\t\tCentimeters\t\tCentimeters\t\tInches");
        
        double inches = 1.0; double Centimeters = 5.0;
        for(int i =1; i<=10; inches++,Centimeters +=5,i++){
            System.out.println(inches +"\t\t"+ incToCentimeter(inches)+ "\t\t\t"+Centimeters +"\t\t\t"+centmeterToInch(Centimeters));
            
        
    }
    }
    public static double incToCentimeter(double in){
        
        return (int)(2.54 *in);
    }
    
    public static double centmeterToInch(double cm){
        
        return(0.3937 * cm);
        
    }
    
    
}
