
class	Jlab12

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				17/09/2014
// Purpose : 			to get the Average of 3 sums


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {	// declre variables beening used
    	double milesPerTrip;
    	double hoursPerTrip;
    	double petrolUsed;
    	double AverageMilesPerHour;
    	double AverageMilesPerGallon;
    	
    
    	System.out.println("Enter your miles ");   
		milesPerTrip = EasyIn.getDouble();
		System.out.println("Enter your Hours per trip ");   
		hoursPerTrip = EasyIn.getDouble() ;
		System.out.println("Enter your Petrol used ");   
		petrolUsed = EasyIn.getDouble() ;
		
		
		AverageMilesPerHour = milesPerTrip / hoursPerTrip; //calculating sums for Average miles per hour
     	AverageMilesPerGallon = milesPerTrip / petrolUsed;	//calculating sums for Average miles per Gallon
		
    	System.out.println("Your average miles per trip was " + AverageMilesPerHour);	//displays average miles per hour
    	
    	System.out.println("Your average miles per trip was " + AverageMilesPerGallon);	//displays average petrol used
    	
    	
    	
    	
    	
    	
    }
}

