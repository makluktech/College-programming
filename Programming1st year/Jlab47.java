
class	Jlab47	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				21/11/2014
// Purpose : 			To count the apperance of the letter A



{
    public static void main(String[] args)
    {
    	String name;    
    	int counter	=0;
    	char letter;
    	char car;
    	int counter2=0;
    
    	
    	System.out.print(" Please enter a Name :");   // prompts user for a name
		name = EasyIn.getString();
		letter = 'a';
	
	   
			for(counter = 0; counter < name.length(); counter++)	//loop to get count
				{
					car = name.charAt(counter);	
					
			if (car == letter)// set the char variables equal + count if characters are 'a'
				{
					counter2++;
							
				}
					
					
				}
				
			System.out.print("The letter A appeared ->" +counter2);// prints the count of letter 'a'
    
    }
}

