
class	Jlab662	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/01/2015
// Purpose : 			Method to take in interger as argument and return true if argument is an even number



{
		public static String firstName(String name)
	{//METHOD TO TAKE IN A STRING AND RETURN ONLY THE FIRSTNAME
	
		String firstName;
		int position;
		
		

		position = name.lastIndexOf(" ");
		firstName = name.substring(0,position);
		
		return firstName;//return firstname
		
	}
	
    public static void main(String[] args)
    {
    	String name;
    
    	
    	
    	System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();//take in user input
				
    
    	System.out.println("The surname entered was :"+	firstName(name) );// call in firstname method and print only the first name entered back
    }
}

