
class  Jlab48	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				26/11/2014
// Purpose : 			Remove middle name from input



{
    public static void main(String[] args)
    {
    	String name;
    	String firstName;
		String surName;
		int position;
		int position2;
	
		
		System.out.print("Please enter a Name :");// prompt user to enter a name  
		name = EasyIn.getString();		
		position = name.indexOf(" ");
		position2 = name.lastIndexOf(" ");
		firstName = name.substring(0,position);// sets the first name to first position
		surName = name.substring(position2 + 1);//sets surname to the first position after space in the string
		System.out.println("The name entered without the middle name is :"+ firstName + surName);// prints name back without the middle name that was entered.
    	
   	
    
    }
}

