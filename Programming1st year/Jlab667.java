
class	Jlab667	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				14/02/2015
// Purpose : 			To take input and write occurance of  of the letter A & a

{
	public static int letterOccur(String name)
	{//METHOD TO COUNT THE OCCURANCE OF LETTER A OR a
		int counter	=0;
    	char letter1;
    	char car;
    	int counter2 =0;
    	char letter2;
    	
		letter1 = 'a';
		letter2 = 'A';
			 
			for(counter = 0; counter < name.length(); counter++)	//loop to get count
				{
					car = name.charAt(counter);	
					
					if (car == letter1||car ==letter2)// set the char variables equal + count if characters are 'a'
						{
							counter2++;//and one each time find A or a
						}
						
				}
				
			return counter2;
		
    }//end of method
    public static void main(String[] args)
    {
    	String name; 
    	
    	System.out.print(" Please enter a Name :"); // prompts user for a name
		name = EasyIn.getString();
    		
    	System.out.print(" The leter 'A' occured  :"+letterOccur( name));
    	//call in method leeterocurrance to print the occurance of letter 'a'or letter'A'   
    
    }
}

