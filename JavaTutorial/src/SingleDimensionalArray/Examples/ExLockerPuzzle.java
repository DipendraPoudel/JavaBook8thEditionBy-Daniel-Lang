
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dipendra
 */
public class ExLockerPuzzle {
    
    static final int Size =100;
    public static void main (String [] args)
    {
        boolean [] lockerArray = new boolean[Size];
    
        lockerPuzzle(lockerArray);
    
    
    }
    
    /*boolean false = closed 
     boolean true = opened*/
    
    
    public static void lockerPuzzle (boolean [] lockerArray)
    {
     
     System.out.println("Initially the array is "+ lockerArray[0]);
    
     /*first students s1 enters and opens every locker*/
    
     Arrays.fill(lockerArray, Boolean.TRUE);   // this methods fills the array elements with boolean value which in this case 
                                               // all the locker are open state 
    
    
        for( int i = 2 ; i < Size; i++)   // i is students
        
            for(int j = i ; j< Size; j+=i)
            
            
             /*i is 2 and start with second locker and after one iteration i increments by 1 and adds to i which is 3rd locker and so on */
                lockerArray[j] = lockerArray[j]== false;
                  displayOpenArray(lockerArray);
            
        
            
        }

    /*displays locker that are opens , displays the number of locker that are open*/
    public  static void displayOpenArray(boolean[] lockerArray) {
        
        int openLockerCounter = 0;
        
        for(int i = 0 ; i < Size; i++)
        {
            if(lockerArray[i]== true){
        
                System.out.printf("%-3d", i);
            
                    openLockerCounter++;
                }
           
        }
        
         System.out.println("There are "+ openLockerCounter + " opened locker ");
        
       
    }
    
    
}
