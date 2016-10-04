
class Jlab45

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				14/11/2014
// Purpose : 			Take in a name and print it back in reverse order



{
    public static void main(String[] args) 
    {
    	String name;    
    	int counter	=0;
    	char letter;
    	
    	System.out.print(" Please enter a Name :");   // prompts user for a name
		name = EasyIn.getString();
	
	   
		for(counter =name.length()-1;counter >=0;counter--)	//looping from last position back to first position
			{
					
		
					letter = name.charAt(counter);//sets the character to counters position in the string index
					System.out.print(letter);// prints the 	letters in new order back to screen				
			
			}
    		
    	
    
    }
}

 