
class	Jlab65	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015 
// Purpose : 			Methods to return menu choice 


{
	public static void menu(int choice)
	{  //Method for users choice
	
		double input;	
		input = 0.0;   	 
    	
		switch(choice)
		{
		
		case 1 :
		
	
		fahrenheit(input); //If 1 is press go to fahrenheit method
		
		break;
	
		case 2:
			celcius(input);//If 2 is press go to celcius method
		break;
			
		case 3: 
			inches(input);//If 3 is press go to inches method
			
		break;
	
		case 4:
			centimeters(input);//If 4 is press go to centimeters method
			
		break;
		
		case 5:
			pounds(input);//If 5 is press go to pounds method
			
		break;
		
		default:
		System.out.println("You should only use the numbers 1 to 5");//print to screen if user enters number higher than 5
		
		}		
    
	}
	
	public static void fahrenheit(double input)
	{// convert fahrenheit to celcius
		double result;
		
		System.out.print("\nPlease enter tempature in fahrenheit :");//prompt user for input
    	input = EasyIn.getDouble();
	
    	result = (input - 32) * 5 / 9;							// calculate conversion	
		System.out.println(" "+ input +" fahrenheit is "+result +" "+"celcius");//output conversion
    		
	}
		public static void celcius(double input)
	{//convert celcius to fahrenheit
		
		double result;
		
		System.out.print("Please enter the tempature in Degrees Celcius : "); //prompt user for input
		input = EasyIn.getDouble(); 
					
		result = (input * 9 / 5) + 32;							 // calculate conversion	
		System.out.print("\n"+ input +" celcius is "+result +" "+"fahrenheit");//output conversion			
			
	}
	
	
	public static void inches(double input)
	{// Method used to convert Inches to Centimeters  
		
		double result;
		
		
		System.out.print("\nPlease enter the size in inches : ");		//prompt user for input
		input = EasyIn.getDouble(); 
					
	    result = input  * 2.54; 									// calculate conversion				
					
	   	System.out.print("\n"+ input +" inches is "+result+" "+ "Centimeters");	//output conversion
			
		
	}
	public static void centimeters(double input )
	{//Method used to convert Centimeters to Inches
	
		double result;
		
		System.out.print("\nPlease enter the size in Centimetres : "); //prompt user for input 
		input = EasyIn.getDouble(); //gets input
				
		result = input  / 2.54; // calculate conversion				
				
			System.out.print("\n"+ input +" centimeters is "+result +" "+"Inches");//output conversion
		
	}
	
	public static void pounds(double input)
	{//method to convert pounds to kilos
		double result;
	
		
		System.out.print("\nPlease enter the weight in pounds : "); //prompt user for input
		input = EasyIn.getDouble(); //gets input
				
		result = input  / 2.2; 	// calculate conversion		
				
		System.out.print("\n"+ input+" pounds is "+result+ " "+"Kilos"); //output conversion
			
	}
	
    public static void main(String[] args)
    { 
    	int choice;
    	do{// do this while user input is less than 6
    	
    
   		System.out.println("\nPlease enter you menu choice \n\n 1.Fahrenheit to Celcius \n 2.Celcius to Fahrenheit \n 3.Inches to Centimeters \n 4.Centimeters to inches \n 5.Pounds to Kilograms \n ");
        choice = EasyIn.getInt();
		menu(choice);//go to menu method after user selection
    
    	}while (choice <6);
   			
   			if (choice >=6)// if the user selection is 6 or above print goodbye
   				{
   					System.out.println("\t\tThank you Goodbye");
   				}
    
    }
}

