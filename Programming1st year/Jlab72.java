


class Jlab72
// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				15/02/2015
// Purpose : 			To get read in an array of intergers and tell the highest and lowest numbers in the array


{	
  	
    public static void main (String[]args )  
	{  
		int 	myArray [];
    	int 	index;
    	int 	highestNumber;
    	int		lowestNumber;
    	
        myArray = new int [5]; //set array of 5
		highestNumber=0;
		lowestNumber=0;
		
		
    	for (index = 0; index <= 4;index ++)
    		{
    			System.out.print("Please Enter your numbers to check : ");//prompt user to enter 5 number
				myArray [index] = EasyIn.getInt();
    		}
    
    	System.out.println("The numbers entered in the array were : " );
    	System.out.println();
    	for (index = 0; index <= 4;index ++)
    		{
    			System.out.println(myArray [index]);//print the numbers entered in the array
    		}
    	System.out.println();
    	for (index = 0; index <= 4;index ++)
    		{
    			
    		if (index == 0)
    			{//set both highest and lowest to equal to index position 0
    				lowestNumber = myArray [index];
    				highestNumber = myArray [index];	
    			}
   		else if(myArray [index] < lowestNumber)//to check lowest number
    			{
    				lowestNumber = myArray [index];//replace if the number is lower
    			}
    			
    		else if(myArray [index] > highestNumber)//to check highest number
    			{
    				highestNumber = myArray [index];//if new number is higher replace it
    			}
			}	
		System.out.println("The highest number in the array was :" + highestNumber);// print the highest number found
		System.out.println();
		System.out.println("The lowest number in the array was :" + lowestNumber);// print the lowest number found
					
    		
		
	    
    }
   
}
