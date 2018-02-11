/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleDimensionalArray.Examples;

import java.util.Scanner;

/**
 *
 * @author dipendra
 */
public class Ex615EliminatingDuplicates {

    static final int SIZE = 10;

    public static void main(String[] args) {


        int[] numbers = new int[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt();

        printArray(eliminateDuplicates(numbers), 10);

    }

    public static int[] eliminateDuplicates(int[] list) {

        int[] temp = new int[list.length];
        int tempIndex = 0;  // current size of array
        boolean isDuplicate = false; // is used to store the number if it is duplicate // begigin isDuplicate false, in temp array
        for (int i = 0; i < list.length; i++){
            for (int k = 0; k < list.length; k++) {
                if (temp[k] == list[i]) {
                    isDuplicate = true;

                }
            }
            if (!isDuplicate) {
                temp[tempIndex++] = list[i];
            }

        }
        int[] trimmedArray = new int[tempIndex];
        System.arraycopy(temp, 0, trimmedArray, 0, tempIndex);

        return trimmedArray;
    }

    public static void printArray(int[] array, int numberPerLine) {

                for (int i = 0; i < array.length; i++) {

                    System.out.printf("%2d ", array[i]);
                    if ((i + 1) % numberPerLine == 0) System.out.println("");
                }
    }
}
