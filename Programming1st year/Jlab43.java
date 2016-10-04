
class Jlab43

// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				06/10/2014
// Purpose : 			displays number of char entered in users input



{
    public static void main(String[] args)
    {
    	String name;
    	int numOfChar;
    	
    
    	System.out.print(" Please enter a Name :");   // prompts user for a name
		name = EasyIn.getString();
		
		numOfChar = name.length();// gets number of characters 
		System.out.println(" The Number of Characters in the name entered was  :"+numOfChar);  // prints the number of characters 
		
    
    }
}

