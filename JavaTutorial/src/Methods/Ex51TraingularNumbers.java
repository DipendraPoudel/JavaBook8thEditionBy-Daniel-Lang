/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.io.IOException;

/**
 *
 * @author dipendra
 */

  
public class Ex51TraingularNumbers {

  public static void main(String[] args) throws IOException {
  
      
      int n = 100;
      System.out.println(getTnumber(n));
  }
  public static int getTnumber(int n) {
      int NUMBER_PER_LINES =10;
      int count =0;
      for(int i = 1; i<= n ; i++ ){
          
        int j = i*(1 + i)/2;   // this is formula for computer triangular number
                                   //The calculated numbers are stored in variable in variable j
        
        count++;
        if(count % NUMBER_PER_LINES == 0){
              System.out.println(j+ " ");
          
          }
          
        else{
              System.out.print(j + " ");
          
          
          }
          
         }
     
    return 0;
      }
      
      
  }
   
  
  
  

