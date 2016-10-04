
class	Jlab666	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157 
// Date :				14/02/2015
// Purpose : 				Method to write the users input with names reversed



{
	public static  void reverseOrder(String name)
	{
		//String name;    
    	int counter	=0;
    	char letter;
    	String newname;
    

		for(counter = name.length()-1;counter >=0;counter--)	//looping from last position back to first position
			{
				if(name.charAt(counter)==' ')
					{
						System.out.print(name.substring(counter+1));// prints from first letter after space
						System.out.print(' ');						// prints space
						System.out.println(name.substring(0, counter));// prints upto the space
					}
		
			}
    		
    
	}
    public static void main(String[] args)
    {
    	String name;
    
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    	reverseOrder(name);  // call in method reversecase	
    
    }
}

