
class Jlab35

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				31/10/2014
// Purpose : 			find highest/lowest/current average



{
    public static void main(String[] args)
    {
    	int numberOfNums;
    	int inputNumber; 
    	double averageNum = 0 ;
    	int largestNum;
    	int smallestNum;
    	int counter =1;
    	int totalSum;
    	boolean exit = false;
    	
    	System.out.print("Please enter the amount of numbers to be entered  :");
    	numberOfNums = EasyIn.getInt();
    	System.out.print("Please enter your first input  :");
    	inputNumber = EasyIn.getInt();
    	largestNum = inputNumber;
    	smallestNum = inputNumber;
    	totalSum = inputNumber ; 
		while(inputNumber != 0)//starts loop 
    		{
    		
    			if(inputNumber == 0)   // to exit loop
    					
    					{
    						exit = true;
    					}
    						
    			else if (inputNumber > largestNum ) // shows largest number
    					{
    						largestNum = inputNumber;
    				  
    					
    					}
    				
    			else if (inputNumber < smallestNum)// shows smallest number
    					{
    						smallestNum = inputNumber;
    						
    					}
    						
    				
    						
    			System.out.println("Enter zero to exit. " );
    			System.out.print("Enter your next numbers : " );
    			inputNumber = EasyIn.getInt();
    			totalSum = totalSum + inputNumber;
    			System.out.println("\t\nThe total is  :" + totalSum);
    			System.out.println("\t\nThe counter is  :" + counter);
    			averageNum = (double) totalSum / counter;
    			counter++;	
    			}
    			
    			System.out.println("\t\nThe largest number is  :" + largestNum);//displays current largest num
    			System.out.println("\t\nThe smallest number is :" + smallestNum ); //display current smallest number
    			System.out.println("\t\nThe Average number is  :" + averageNum);// display current average 

     
   
    
    
    }
}

