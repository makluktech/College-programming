
class	Jlab665	 

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				14/02/2015
// Purpose : 			Method to write the users input in reverse



{
		public static void reverseCase(String name)
	{//METHOD TO TAKE IN A STRING AND RETURN IT IN REVERSE ORDER
	
	 
    	int counter	=0;
    	char letter =' ';
    	
     
	   
			for(counter =name.length()-1;counter >=0;counter--)	//looping from last position back to first position
				{
					letter = name.charAt(counter);//sets the character to counters position in the string index
					System.out.println(letter);// prints the 	letters in new order back to screen				
				}
    		
		
	}
	
    public static void main(String[] args)
    {
    	String name;
    
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    		reverseCase(name); // call reverse method
    }
}

