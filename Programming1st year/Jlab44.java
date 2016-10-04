
class Jlab44

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				12/10/2014
// Purpose : 			Count the amount of uppercase characters 



{
    public static void main(String[] args)
    {
    	String name;
    	int numOfChar =0;
    	int counter=0;
    
    	System.out.print(" Please enter a Name :");   // prompts user for a name
		name = EasyIn.getString();
		
		for(counter =0;counter < name.length();counter++)	//looping while there is characters in the name
		{
			if(name.charAt(counter)>='A'&& name.charAt(counter)<='Z')// checking if of upper case characters
			
				{
					 numOfChar++;//counting uppercase characters
				
				}	
			
		}
    			System.out.println("The character count is :"+numOfChar);// print number of uppercase characters
    
    }
}

