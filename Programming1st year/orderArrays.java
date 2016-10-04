


class orderArrays
// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				16/02/2015
// Purpose : 			ordered Arrays

	

	{  //Method for users choice
	
	public static void menu()
	
	{
		System.out.println("     Menu    ");
		System.out.println("  1. Add customer   ");
		System.out.println("  2. Search for a id ");
		System.out.println("  3. Delete customer");	
		System.out.println("  4. List all customers ");
		System.out.println("  5. Exit   ");
		
		System.out.println(" ");
		System.out.println("     Enter a number in the range 1 to 5   ");


	}
	
    
	
	public static int addNewElement(int []myFirstArray, int theCorrectPlace,int noOfElements,int newNumber)
	{
		int newplace=0;
		int step;
	
		if (noOfElements == 0)//
			{
				myFirstArray[0] = newNumber;
				noOfElements ++;	   // no of elements used up in array
			}
	else
		{
		for (step = noOfElements - 1 ; step >= theCorrectPlace; step --)
			{
	
				myFirstArray[step + 1] = myFirstArray[step] ; // MOVE UP A PLACE
			}	
			
			myFirstArray[theCorrectPlace] = newNumber;			
			noOfElements ++;
	
		}

		
	return noOfElements;
	}
	
 	public static int numPosition(int[]theArray,int theNum, int noOfElements )
 	{//METHOD TO FIND PLACE TO PUT NUMBER IN  ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((theNum >theArray[step]) && (step < noOfElements))
			{
				step ++;
			}
	place = step ;   // Finds the correct location of place		

	return place;
}
	public static int findNumber(int[]theArray,int theNum, int noOfElements )
 	{//METHOD TO FIND IF A NUMBER WAS ENTERED IN THE ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((step < noOfElements) && (theNum >theArray[step])  )
		{
			step ++;
		}
			 
		if(step == noOfElements) 
			{
				place = -1;
			}	
		else if(theNum==theArray[step])//check if number is equal to num in that position
			{
				place = step ; 
			}
		else
			{
				place = -1;
			}	
	
	return place;
}

public static int deleteNumber(int[]theArray,int theNum, int noOfElements )
 	{//METHOD TO delete a number ENTERED IN THE ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((step < noOfElements) && (theNum >theArray[step]))
		{
			step ++;
		}
			 
		if(step == noOfElements) 
			{
				place = -1;
			}	
		else if(theNum==theArray[step])//check if number is equal to num in that position
			{
				place = step ; 
			}
		else
			{
				place = -1;
			}
		for(step = place; step < noOfElements -1;step++)	
			{
				theArray[step] = theArray[step +1];
			}
			theArray[noOfElements -1]=step;
		
			noOfElements --;
	
	return place;
}
  public static void main(String []args ) 
    {//Make an array that take in numbers and prints back to the user
       int myFirstArray[];
       int index;
       int newNumber;
       int noOfElements;
       int theCorrectPlace;
       int step;
       int option;
       myFirstArray = new int[5];
       noOfElements =0;
    
       //System.out.println("The correct place is:"+theCorrectPlace);
       System.out.println();
      
	   	int choice;
	   	
    	do
    	{// do this while user input is less than 4
   		
    	menu();
    	System.out.print("     Please enter your choice   >> ");
		option = EasyIn.getInt();
    	
    	switch(option) 
    	{
    		
    	case 1:	{
		    		System.out.println("Please enter your number");
			       newNumber = EasyIn.getInt();//take in numbers entered by user
			       theCorrectPlace = numPosition(myFirstArray,newNumber,noOfElements);
			       noOfElements=addNewElement(myFirstArray, theCorrectPlace, noOfElements, newNumber);
		    			
    			}
    	break;
    	
    	case 2:	{
    				 System.out.println("Please enter a number you want to find");
       				 newNumber = EasyIn.getInt();//take in number to find
        
	        if(findNumber(myFirstArray,newNumber,noOfElements )== -1)//call in method to to find if number is in array
	        	{
	        	   System.out.println("The number you entered is not in the array :");
	        	}
	       	else
	        	{//print the position of the number 
	        		System.out.println("The number your looking for is in position :"+findNumber(myFirstArray, newNumber, noOfElements ));
	        	}
    			}
    	break;
    	case 3:	{
    				System.out.println("Please enter a number you want to delete :");
				     newNumber = EasyIn.getInt();//take in number to delte
				    	 if(findNumber(myFirstArray,newNumber,noOfElements )== -1)//call in method to to find if number to delete is in array
					       {
					          System.out.println("The number you entered to delete is not in the array :");
					        }
	       	else
	        	{
	        	
	        		System.out.println("The number you have  deleted was in position :"+deleteNumber(myFirstArray, newNumber, noOfElements ));//print position of deleted num
		        	System.out.println("The number you have deleted was number :"+newNumber);//print deleted number 
		        	
	        	}//end of else
    
    			}
    	break;	
    	case 4:	{
		    		 for(index=0;index<5;index++)
			      		{
			       			System.out.println(myFirstArray[index]);
			      	 	}
    
    			}
    	break;		
    	}
    		
    	}while (option != 5);
    	
    	
    	
    }
   
}
