/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class areaofpolygon{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Enter the number of sides
    System.out.print("Enter the number of sides: ");
    int numberOfSides = input.nextInt();

    System.out.print("Enter the side: ");
    double side = input.nextDouble();
    
    System.out.println("The area of the polygon is " + 
      area(numberOfSides, side));
  }
  
  public static double area(int n, double side) {
    return n * side * side / Math.tan(Math.PI / n) / 4;
  }
}
