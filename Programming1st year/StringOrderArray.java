
class	StringOrderArray	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				07/03/2015
// Purpose : 			To take in a string a find position in array and delete

{

	
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
 	{//METHOD TO FIND IF A NAME WAS ENTERED IN  ARRAY
 
 	int step;
	int place =0;
	
	step = 0;
 		
	while ((step < noOfValues) && (theName.compareTo( namesArray[step])) >0)
			{
				step ++;
				System.out.println("step is " + step);
	
			}
	
	
		if(step == noOfValues) 
			{
				
				System.out.println("this is in the find place method");
					System.out.println("this is step :"+ step);
						System.out.println("this is num values"+noOfValues);
				place = -1;
			}
			
		else if(theName != namesArray[0])//check if name is equal to num in that position
			{
				place = -1; 
			}
		if(place == -1)
			{
				place = -1;
			}
		else
			{
			  place = step;
			}	
	
		System.out.println("this is place   method"+place);
	return place;
}

    public static void main(String[] args)
    {
      String myFirstArray[];
      int index;
      String names;
      int noOfValues; 
      int theCorrectPlace;
      int step;
      
      myFirstArray = new String[3];
      noOfValues =0;
     
    	 for(index=0;index < 3;index++)//loop and prompt to enter names till required amount is entered
    	 	{
     			System.out.println("Please enter a name");
	       		names = EasyIn.getString();//take in names entered by user
	       		theCorrectPlace = wordPosition(myFirstArray,names,noOfValues);
		        noOfValues=addNewName(myFirstArray, theCorrectPlace, noOfValues,names);
		        
       		}
       	   System.out.println();
	       for(index = 0;index < 3; index++)
	      		{
	       			System.out.println(myFirstArray[index]);
	      	 	}
      	 	
      System.out.println("Please enter the name you want to find");
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
	        	
	    System.out.println("Please enter a name you want to delete :");
        names = EasyIn.getString();//take in number to delte
        
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
}

