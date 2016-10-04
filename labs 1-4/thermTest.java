/*
** Author: Colm Carey	Date:03/11/2015                                                                             /10/2015
** Purpose: Add functionality to thermometer class
*
*/


public class thermTest
{ // begin class ThermTest
  public static void main(String args[]) 
  { // being main
    double tempB;				
    thermometer thermA = new thermometer();
    thermometer thermB = new thermometer(20);
//print thermometer A is  + celsius
    System.out.println("Temp. of Thermometer A is " + 
      thermA.getCelsius());
    
  //print thermometer A in fah is  
    System.out.println("Temp. of Thermometer A in fahrenheit is " +     
       thermA.getFahrenheit());
    thermA.setCelsius(20.0);
    
    System.out.println("Temp. of Thermometer A is " + 
    		  thermA.getCelsius());
    
    System.out.println("Temp. of Thermometer A in fahrenheit is  " + 
    	      thermA.getFahrenheit());
    
    	
    
    tempB = thermB.getCelsius();
    System.out.println("Temp. of Thermometer B is " + tempB);	
    System.out.println("Temp. of Thermometer A in " +  thermB.getFahrenheit());
    thermA.setFahrenheit(100);	
    System.out.println("Temp. of Thermometer A in Fahrenheit is " + 
     thermA.getFahrenheit() +" and in Celsius is " + thermA.getCelsius());
    
  } // end main
} // end class ThermTest