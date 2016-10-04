
class	Jlab46	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/11/2014
// Purpose : 			To write user input with names reversed



{
    public static void main(String[] args)
    {
    	String name;    
    	int counter	=0;
    	char letter;
    	
    	System.out.print(" Please enter a Name :");   // prompts user for a name
		name = EasyIn.getString();
		
	   
		for(counter = name.length()-1;counter >=0;counter--)	//looping from last position back to first position
			{
				if(name.charAt(counter)==' ')
				
					{
						System.out.print(name.substring(counter+1));// prints from first letter after space
						System.out.print(' ');						// prints space
						System.out.print(name.substring(0, counter));// prints upto the space
						
					}
		
					
			
			}
    		
    
   		
    
    }
}

