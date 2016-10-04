
class	Jlab68

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				19/11/2014
// Purpose : 			To take in a string and an intergar return it representing 
					//the position to start looking back from index position of last space

{
	public static int myLastSpace(String sentence,int newPosition)
	{
	 

		int position =0;
		int index;
	
		for (index =0;index <sentence.length();index++) 
			{
				if(newPosition>=position)
				{
					position = sentence.lastIndexOf(" ");
					newPosition= position;
				}
    		}
    		
    	return position;
   	
    }//end of method
    public static void main(String[] args)
    { 
    	String sentence;
    	int newPosition;
    	System.out.print(" Please enter a Name :"); // prompts user for a name
		sentence = EasyIn.getString();
		System.out.print(" Please enter a Number :"); // prompts user for a name
		newPosition = EasyIn.getInt();
    
    	System.out.print(" The   :"+myLastSpace( sentence,newPosition));// prints the count of letter 'a'   
    
    }
}

