
class	Jlab82	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				13/03/2015
// Purpose : 			Method to take in interger and return the number of times highest number appeared



{
		
   	public static int findHighestNum(int[] myArray)
	{//METHOD TO FIND HIGHEST NUMBER IN THE ARRAY
		int highestNum ;
		int index;
	
		
		highestNum=0;
		index = 0;
	
		
		for(index = 0; index < myArray.length; index++)
    		{
    			if(myArray[index] > highestNum)//compare the numbers
    				{
    					highestNum = myArray[index] ;	//set highestnumber
    					
    				}
    						
    		}
    		
    	return highestNum; //return highest number
	}
	public static int countHighesNum(int[] myArray, int number)
	{//METHOD TO FIND THE COUNT OF THE HIGHEST NUMBER IN THE ARRAY
		
		int index;
		int count;
		
		
		index = 0;
		count=0;
		
		for(index = 0; index < myArray.length; index++)
    		{
    			if(myArray[index] == number)//compare the numbers
    				{
    					number = myArray[index] ;	//set highestnumber
    					count ++;				//sets index position of highest number
    				}
    						
    		}
    		
    	return count; //return count
	}
					
    public static void main(String[] args)
    {
    	int myArray[];
    	int index;
    	int result1 =0;
    	int result2=0;
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
    	result1 = findHighestNum(myArray );// set result1 to findHighestNum
    	result2 = countHighesNum(myArray,result1 );	// set result2 to countHighestNum
    	System.out.println("The index position of the highest number is : " + result1);//print the highest number
    	System.out.println("--------------------------");
    	System.out.println("The  highest number appeared  : " + result2+" Times");// print the amountof times highest number appeared
    	
    }
}

