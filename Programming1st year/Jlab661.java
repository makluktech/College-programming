
class	Jlab661	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				11/02/2015
// Purpose : 		



{	
	public static String surname(String name)
	{//METHOD TO TAKE IN A STRING AND RETURN ONLY THE SURNAME
	
		String surName;
		int position;
		
		

		position = name.lastIndexOf(" ");
		surName = name.substring(position +1 );
		
		return surName;
		
	}
    public static void main(String[] args)
    {
    	
    	String name;
    
    	
    	
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    
    	System.out.println("The surname entered was :"+	surname(name) );// call in surname method and print it
    	
	
    	
    
    }
}

