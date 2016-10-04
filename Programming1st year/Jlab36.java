
class Jlab36

// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				05/10/2014
// Purpose : 			while to display highest smallest average number 
//                      and occurance of largest and smallest entry


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	
    	int inputNumber;
    	int numberOfNums; 
    	int largestNum;
    	int smallestNum;
    	double averageNum = 0;
    	int totalSum;
    	int counter  = 1;
    	int lrgCount = 0;  
    	int smlCount = 0;
    	boolean exit = false;
    	
    	
    	System.out.print("Please enter the amount of numbers to be entered : ");
    	numberOfNums = EasyIn.getInt();
    	System.out.println("Please enter your first number : ");
    	inputNumber = EasyIn.getInt();
    	smallestNum = inputNumber;
    	largestNum  = inputNumber;
    	totalSum    = inputNumber;
    	
    
       	
    	while (inputNumber !=0)	// start of loop
    	{   
    			
    		if(inputNumber == 0)// exit when 0 is entered 
    			{
    				exit = true;
    			}
      		else if(inputNumber > largestNum)		// finds largest number  
      			{
      				largestNum = inputNumber; 
      			}
      		else if(inputNumber < smallestNum)		 // find smallest number
      			{
      				inputNumber = smallestNum;
      			}
      			
      		 else if ( inputNumber == largestNum)  // counts the times the largest number is entered
      			{
      			    lrgCount++;     				   
      			}   	    		
      		
      	    if (inputNumber == smallestNum)        //counts the times the smallest number is entered
      			{
      				 smlCount++ ;
      				    
      			}   
      					
    	      				
      		
      		System.out.println("Enter your next Number :");    	   		
    		System.out.println("Or enter zero to exit : ");    		
    		inputNumber = EasyIn.getInt();	 
    		totalSum = totalSum + inputNumber;					   	// calculates sum of numbers entered
    		System.out.println("The total sum is    :" + totalSum  );
    		System.out.println("The number count is :" + counter);  // prints the number count
    		averageNum = (double) totalSum / counter;				// calculates average number
    		
    		counter++;
    		
    	}	// end of while loop
    	
    		System.out.println("\t\nThe Average number  is  :" + averageNum  );// display current average number
    		System.out.println("\t\nThe largest number  is  :" + largestNum  +" and was entered  :"+ lrgCount + " Times");//displays current largest number
    		System.out.println("\t\nThe smallest number i s :" + smallestNum +" and was entered  :"+ smlCount + " Times" ); //display current smallest number
				 
    }
}

