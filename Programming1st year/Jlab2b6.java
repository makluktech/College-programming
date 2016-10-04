
class Jlab2b6

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				15/10/2014
// Purpose : 			Credit card Interest



{
    public static void main(String[] args)
    {
    	int menuOption;		// variables used
    	double fahrenheit;
    	double inches;
    	double celcius;
    	double centimetres;
    	double kilos;
    	double pounds;
   //////////////// menu choice
    	System.out.print("Please select your menu option : \n\n 1.Fahrenheit to Celcius \n 2.Celcius to Fahrenheit \n 3.Inches to centimetres \n 4.Centimetres to inches \n 5.Pounds to Kilograms \n ");
    	
    	menuOption = EasyIn.getInt();
    	
    	switch (menuOption)
    	{
    		// Convert fahrenheit to Celcius
    		case 1:
    			System.out.print("Please enter tempature in fahrenheit :");
    			fahrenheit = EasyIn.getDouble();
    			celcius = (fahrenheit - 32) * 5 / 9;
    			System.out.println("The tempature converted to degrees is :" + celcius);
    			break;
    		// Convert celcius to fahrenheit
    		case 2: 
			
				System.out.print("Please enter the tempature in Degrees Celcius : "); 
				celcius = EasyIn.getDouble(); 
					
				fahrenheit = (celcius * 9 / 5) + 32; 
					
				System.out.println("The tempature converted to Fahrenheit is: " + fahrenheit); 
				break;
			// Convert Inches to centimetres
			case 3: 
			    		
			    System.out.print("Please enter the size in inches : "); 
			    inches = EasyIn.getDouble(); 
				
			    centimetres = inches  * 2.54; 			
				
			    System.out.println( inches + " - Inches converts to  " + centimetres + " Centimetres"); 
				break;
			
			// Convert centimetres to inches
			case 4:
			
				System.out.print("Please enter the size in Centimetres : "); 
			   	centimetres = EasyIn.getDouble(); 
				
				inches = centimetres  / 2.54; 			
				
				System.out.println( centimetres + " - Centimetres converts to  " + inches + " Inches"); 
			
				break;
			
			// Convert Pounds to Kilograms
			case 5:
			
			System.out.print("Please enter the weight in pounds : "); 
			pounds = EasyIn.getDouble(); 
				
			kilos = pounds  / 2.2; 			
				
			System.out.println( pounds + " - pounds converts to  " + kilos + " kilograms"); 
			
				break;
			
			
			
		}	
			
  

     
    
    
    
    
    }
}

