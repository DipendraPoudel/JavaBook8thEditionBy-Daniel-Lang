/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopS;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Test {
public static void main(String args [])
{

    perfectNumber(6,200);
}

static void perfectNumber(int num1, int num2){

    int i; int j; int sum=0;

     for (i=num1;i<=num2;i++){
            for(j=1;j<=i/2;j++){
                if(i%j==0){
                    sum= sum+j;
                }

            }
            if(sum==i){
                System.out.println("The perfect number between two numbers: "+sum);
            } 
            sum=0;
        }


    }
}
    

