
class	Jlab81	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				12/03/2015
// Purpose : 			To take in an array of numbers and give back the position of the highest number

{
	public static int findHighestNum(int[] myArray)
	{//METHOD TO FIND HIGHEST NUMBER IN THE ARRAY
		int highestNum ;
		int index;
		int position;
		
		highestNum=0;
		index = 0;
		position=0;
		
		for(index = 0; index < myArray.length; index++)
    		{
    			if(myArray[index] > highestNum)//compare the numbers
    				{
    					highestNum = myArray[index] ;	//set highestnumber
    					position = index;				//sets index position of highest number
    				}
    						
    		}
    		
    	return position;//return number
	}				


   	
   
    public static void main(String[] args)
    {
    	int myArray[];
    	int index;
    	
    	myArray = new int[5];
    	for(index = 0; index < myArray.length; index++)//prompt user to enter 5 numbers
    		{
    			System.out.print("Please enter a number :");
    			myArray[index] = EasyIn.getInt();	
    		}
    	System.out.println("--------------------------");
    	for(index = 0; index < myArray.length; index++)
    		{
    			System.out.println(index + " " + myArray[index]);// print the index postion and number in that position
    			System.out.println("--------------------------");	
    		}	
    	System.out.println("The index position of the highest number is : " + findHighestNum(myArray ));
    	
    
    }
}

