
class	Jlab67

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				19/11/2014
// Purpose : 			To take in a string and return index position of last space

{
	public static int myLastSpace(String sentence)
	{
	

		int position =0;
		int index;
	
		for (index =0;index <sentence.length();index++) 
			{
				position = sentence.lastIndexOf(" ");
    		}
    	return position;
   	
    }//end of method
    public static void main(String[] args)
    {
    	String sentence;
    	
    	System.out.print(" Please enter a Name :"); // prompts user for a name
		sentence = EasyIn.getString();
    
    	System.out.println(" The leter a occured  :"+myLastSpace( sentence));// prints the count of letter 'a'   
    
    }
}

