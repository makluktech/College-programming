/*
** Author:Colm Carey	Date: 12/02/2016
** Purpose: to ues try catch statements
*/




   public class TrySample 
    { 
   public static void main (String args[]) 
    { 
   int[] myArray = new int[10]; 
        try 
          { 
             System.out.println("Before valid array assignment"); 
             myArray[0] = 1; 
             System.out.println("Before invalid array assignment"); 
		     myArray[100] = 1; // array is causing exception at this statement
		     System.out.println("After array exception"); 
           } 
       
        catch(ArrayIndexOutOfBoundsException e) 
        {
              System.out.println("An array index error has occured");
        }


    } 
} // end class MyMain
