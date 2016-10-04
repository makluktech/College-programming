
class Jlab31

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/10/2014
// Purpose : 			Loops- menu option



{
    public static void main(String[] args)
    {
    	int menuOption;		// variables used
    	String menu ;
    	
   	
    	menu = "Please select your menu option :";	//prompts user for menu choice
    	menu += "\n\n 1.Fahrenheit to Celcius  :";
    	menu += "\n\n 2.Celcius to Fahrenheit  :";    	
    	menu += "\n\n 3.Inches to centimetres  :";
    	menu += "\n\n 4.Centimetres to inches  :"; 
    	menu += "\n\n 5.Pounds to Kilograms    :";
    	menu += "\n\n 6.Kilograms to pounds    :";
    	menu += "\n\n 7.Exit ";
    	
    	
    	System.out.println(menu) ;
    	menuOption = EasyIn.getInt();
    
     	while (menuOption <7)	// loops while entry is less than 7
     		{
     		
     			System.out.println("Please try again");	
     	 		menuOption = EasyIn.getInt();				//Exit loop
    		}

     
   
    
    
    }
}

