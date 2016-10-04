
class	StringOrderArray	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				07/03/2015
// Purpose : 			To take in a string a find position in array and delete with menu

{
public static void menu()
	
	{
		System.out.println("     Menu    ");
		System.out.println("  1. Add a name   ");
		System.out.println("  2. Search for a name ");
		System.out.println("  3. Delete a name ");	
		System.out.println("  4. List all the names ");
		System.out.println("  5. Exit   ");
		
		System.out.println(" ");
		System.out.println("     Enter a number in the range 1 to 5   ");


	}
	
public static int deletedWord(String []theArray,String deleteName, int noOfValues )
 	{//METHOD TO delete a number ENTERED IN THE ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
		while ((step < noOfValues) && ( deleteName.compareTo(theArray[step]) >0))
			{
				step ++;
			}
				 
			if(step < noOfValues) 
				{
					place = step;
				}	
			else if(deleteName==theArray[step])//check if number is equal to num in that position
				{
					place = -1 ; 
				}
			else
				{
					place = -1;
				}
			for(step = place; step < noOfValues -1; step++)	
				{
					theArray[step] = theArray[step +1];
				}
				theArray[noOfValues -1]=""; 
			
				noOfValues --;
		
	return place;
}
	
	
	
	public static int addNewName(String []myFirstArray,int theCorrectPlace,int noOfValues,String newWord)
	{//METHOD TO ADD A NAME TO THE ARRRAY
		int newplace=0;
		int step;
	
			if (noOfValues == 0)//
				{
					myFirstArray[0] = newWord;
					noOfValues ++;	   // no of elements used up in array
				}
			else
				{
					for (step = noOfValues - 1 ; step >= theCorrectPlace; step --)
						{
			
							myFirstArray[step + 1] = myFirstArray[step] ; // MOVE UP A PLACE
						}	
			
			myFirstArray[theCorrectPlace] = newWord;			
			noOfValues ++;
	
				}	

		
	return noOfValues;
	}
	


	public static int wordPosition(String[]theArray,String aName, int noOfValues )
 	{//METHOD TO FIND PLACE TO PUT NAME IN  ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((step < noOfValues) && ( aName.compareTo(theArray[step]) >0))
			{
				step ++;
			}
	place = step ;   // Finds the correct location of place		

	return place;
	}
	


	public static int findPlace(String namesArray[],String theName,int noOfValues )
 	{//METHOD TO FIND THE POSITION OF A WORD IN THE ARRAY AND SAY IF IT IS NOT THERE
 
 	int step;

	
	step = 0;
 		
	while ((step < noOfValues) && (theName.compareTo( namesArray[step])) >0)
			{
				step ++;
	
			}
	
		if((step == noOfValues)|| (theName.equals(namesArray[step])==false))
		{
				step = -1;
			}
	       	   		
	return step;
}

    
    
    public static void main(String[] args)
    {
      String myFirstArray[];
      int index;
      String names;
      int noOfValues; 
      int theCorrectPlace;
      int step;
      int option;
      
      myFirstArray = new String[3];
      noOfValues =0;
     
    	
    	do
    	
    	{
    	menu();
    	System.out.print("     Please enter your choice   >> ");
		option = EasyIn.getInt();
    	
    	switch(option) 
    	{
    		
    	case 1:	{
    			System.out.println("Please enter a name");
	       		names = EasyIn.getString();//take in names entered by user
	       		theCorrectPlace = wordPosition(myFirstArray,names,noOfValues);
		        noOfValues=addNewName(myFirstArray, theCorrectPlace, noOfValues,names);
    			}
    	break;
    	
    	case 2:	{
    			System.out.println("Please enter a name to search for");
	       		names = EasyIn.getString();//take in name to find
	        	
	        	if(findPlace(myFirstArray,names,noOfValues )== -1)//call in method to to find if name is in array
	        	{
	        	   System.out.println("The Name you entered is not in the array :");
	        	}
	       		else
	        	{//print the position of the name 
	        		System.out.println("The Name your looking for is in position :"+findPlace(myFirstArray,names,noOfValues ));
	        		System.out.println("And the name is  :"+names);
	        	}
    			}
    	break;
    	case 3:	{
    			System.out.println("Please enter a name to be deleted");
	       		names = EasyIn.getString();//take in names entered by user
	       		if(findPlace(myFirstArray,names,noOfValues )== -1)//call in method to to find if name to delete is in array
	        	{
	        	   System.out.println("The Name you entered to delete is not in the array :");
	        	}
	       		else
	        	{
	        	
	        		System.out.println("The Name you have  deleted was in position :"+deletedWord(myFirstArray,names,noOfValues ));//print position of deleted name
		        	System.out.println("The Name you have deleted was number :"+names);//print deleted name 
		        	
	        	}//end of else  
    
    			}
    	break;	
    	case 4:	{
    			for(index = 0;index < 3; index++)
	      		{
	       			System.out.println(myFirstArray[index]);
	      	 	}
    
    			}
    	break;		
    	}
    		
    	}while (option != 5);
    	
    	
    	
	       
         
    }
}

