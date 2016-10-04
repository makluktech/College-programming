


class CustomerUse15
// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				23/04/2015
// Purpose : 			Java Porject 2

	

	{  //Method for users choice
	
	public static void menu()
	
	{
		System.out.println();
		System.out.println("     Menu    ");
		System.out.println("  1. Add Customer   ");
		System.out.println("  2. Delete Customer");	
		System.out.println("  3. List all Customers ");
		System.out.println("  4. Exit   ");
		
		System.out.println();
		System.out.println("     Please enter a number in the range 1 to 4   ");
		System.out.println();


	}
	
	public static int addNewCustomer(Customer []myFirstArray, int theCorrectPlace,int noOfElements,Customer theCustomer)
	{//METHOD TO ADD NEW CUSTOMER TO ARRAY
	
		int step;
		
		
		if(noOfElements == 3)//If all the locations are full, tell the user.
		    	{
		    		System.out.println("\t*************************************************************");
		    		System.out.println("\t* Sorry the array is full you can not add a new customer !! *");
		    		System.out.println("\t*************************************************************");
		    	} 
		
		else if (noOfElements == 0)//
				{
					myFirstArray[0] = theCustomer;
					noOfElements ++;	   // no of elements used up in array
				}
		else
			{
				for (step = noOfElements - 1 ; step >= theCorrectPlace; step --)
					{
			
						myFirstArray[step + 1] = myFirstArray[step] ; // MOVE UP A PLACE
					}	
					
					myFirstArray[theCorrectPlace] = theCustomer;//THIS WAS THE CORRECT PLACE 			
					noOfElements ++;
		
			}

		
	return noOfElements;
	}
	
 	public static int numPosition(Customer[]theArray,int theBalance, int noOfElements )
 	{//METHOD TO FIND PLACE TO PUT BALANCE IN  ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((step < noOfElements)&&(theBalance < theArray[step].getBalance()))//compare balance
			{
				step ++;
			}
	place = step ;   // Finds the correct location of place		

	return place;
}
	public static int searchId(Customer[]theArray,String newCustomerId, int noOfElements )
 	{//METHOD TO FIND IF A NUMBER WAS ENTERED IN THE ARRAY
 
 	int step;
	int place;
	
	step = 0; 		
	while ((step < noOfElements) && !(theArray[step].getId().equals(newCustomerId)))//keep going while id is different
		{
			step ++;
		}
			 
			if(step == noOfElements) 
				{
					place = -1;
				}
					
			else if(newCustomerId ==theArray[step].getId())//check if number is equal to num in that position
				{
					place = -1 ; 
				}
			else
				{
					place = step;
				}	
	
	return place;
}

public static int deleteId(Customer[]theArray,String newCustomerId, int noOfElements,int newPlace )
 	{//METHOD TO DELETE Id ENTERED IN THE ARRAY
 
 	int step; 
 	
	step = 0; 		
			
			for(step = newPlace; step < noOfElements -1;step++)	
				{
					theArray[step] = theArray[step +1];
				}
			
			
			theArray[step]= new Customer();
		
			noOfElements --;
	
	return noOfElements;
}
  public static void main(String []args ) 
    {//Make an array that take in numbers and prints back to the user
       Customer myFirstArray[];
       String newCustomerId;
       String customerName;
       int index;
       int noOfElements;
       int theCorrectPlace;
       int step;
       int option;
       int theBalance;
       int newPlace;
       Customer tempCustomer;
       myFirstArray = new Customer[3];
       noOfElements =0;
       newCustomerId=" ";
       System.out.println();
       
       
	   int choice;
	   	
    	do
    	{// do this while user input is less than 4
   		
    	menu();
    	System.out.print("\t\tPlease enter your menu choice --->> ");
		option = EasyIn.getInt();
    	
    	switch(option) 
    	{
    		
    	case 1:	{
		    		System.out.println("\n\n Please enter customer ID");//prompt for Customer Id /Name and Balance
			        newCustomerId = EasyIn.getString();
			       	System.out.println("Please enter customer name");
			        customerName = EasyIn.getString();
			       	System.out.println("Please enter customer balance");
			        theBalance = EasyIn.getInt();
			       
			        tempCustomer = new Customer(customerName,newCustomerId,theBalance);//create temp array to compare againts myFirstArray
			       
			       
			      
			       
		 		      if( searchId(myFirstArray,newCustomerId,noOfElements)== -1) //if customer Id doesnt exist
				      	{
				      
					       theCorrectPlace = numPosition(myFirstArray,theBalance,noOfElements);
					       noOfElements = addNewCustomer(myFirstArray, theCorrectPlace, noOfElements, tempCustomer);
			    	 	}	
			    	 else
			    		 {
			    		 	System.out.println();
			    		 	System.out.println();
			    		 	System.out.println("\t***************************************************************");
				    	 	System.out.println("\t*  The Customer Id you entered is already in the array !!!!!  *");//Display if customer Id already exist
				    	 	System.out.println("\t***************************************************************");
				    	 	System.out.println();
				    	 	System.out.println("\t\t\tPlease try again !!!!"); 
				    	 	System.out.println();
				    	 	System.out.println();
			    	 	}
		    	 
    			}
    	break;
    	
    
    	case 2:	{
    				System.out.println("Please enter customer Id to delete :");
				    newCustomerId = EasyIn.getString();//take in number to delte
				   	if(searchId(myFirstArray,newCustomerId,noOfElements )== -1)//call in method to to find if number to delete is in array
					     {  
							 System.out.println("The customer you entered to delete is not in the array !!!!");
					     }
					     
			       	else  // to delete id from array
			        	{
			        	 	newPlace =searchId(myFirstArray,newCustomerId,noOfElements );
			        	 	noOfElements= deleteId(myFirstArray,newCustomerId,noOfElements,newPlace );
				         	System.out.println("The customer you have deleted was customer number :"+newCustomerId);//print deleted customer number 
			        	}//end of else
		    
    			}
    	break;
    		
    	case 3:	{
		    		 for(index=0;index < noOfElements;index++) //list the Array
			      		{
			       			System.out.println(myFirstArray[index].toString());
			      	 	}
    
    			} 
    	break;
    	
    	case 4:{
    				System.out.println();
    				System.out.println("\t\t\t**************************");
    				System.out.println("\t\t\t*                        *");
    				System.out.println("\t\t\t*  THANK YOU GOODBYE !   *");//Display when Exit is choosen
    				System.out.println("\t\t\t*                        *");
    				System.out.println("\t\t\t**************************");
    			}		
    	}
    		
    	}while (option != 4);
    	
    	
    	
    }
   
}
