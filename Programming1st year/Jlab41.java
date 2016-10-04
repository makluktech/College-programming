
class Jlab41

// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				06/10/2014
// Purpose : 			prompt user to enter a name and print only surname back to the screen


{
    public static void main(String[] args) 
    {      // variables being used 
    	String name;
		String surName;
		int position;
	
		
		System.out.print("Please enter a Name :");// prompt user to enter a name
		name = EasyIn.getString();		
		position = name.indexOf(" ");
		surName = name.substring(position + 1);//sets surname to the first position after space in the string
		System.out.println("the surname entered is :"+ surName);// prints surname entered.
    }
}

