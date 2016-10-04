/*
** Author: Colm Carey	Date:03/11/2015                                                                             /10/2015
** Purpose: Add functionality to thermometer class
*
*/
public class thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
	// celsius is accessible to all methods in this class
	
	public thermometer()		// constructor method #1
	{
		setCelsius(0);		
	}
		
	public thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}
	public double getFahrenheit()
	{
		return  ((celsius *9) /5+32);// set to convert celsius to fahrenheit
	}
	public void setFahrenheit(double fah)  //set to convert fah to cel
	{
		celsius = ((fah-32)*5/9);		
	}

	
	

} // end class Thermometer
