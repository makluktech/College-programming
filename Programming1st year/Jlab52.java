
class	Jlab52	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				05/12/2014
// Purpose : 			To print input in reverse order



{
    public static void main(String[] args)
    {
    						// declare variables used
    	String sentance;
    	String firstWord; 
    	int spacePosition;
    	int wordCount;
    	char letter;
    
    	
    	 
    	
    	System.out.print("Please enter your sentance : ");
    	sentance = EasyIn.getString();
        spacePosition = sentance.indexOf(" ");// sets spaceposition to the space in the sentance
    	wordCount=1;
    	
    	
    	
    	for(wordCount = sentance.length()-1;wordCount >=0;wordCount--)//start the loop 
        	{
    		
    			
    	   //	firstWord = sentance.substring(0,spacePosition);// checkes upto first space in sentance
    	//	sentance = sentance.substring(spacePosition +1);//sets sentance = to first word
    	////	System.out.println("The first word is :" + firstWord);
    	//	spacePosition = sentance.indexOf(" ");
    		//	wordCount++;								// counts number of words
    		
    			if(sentance.charAt(wordCount)==' ')						//takes the word before the space
    		    	
    		    	{
    		    		
    		    		System.out.print(sentance.substring(wordCount+1));// prints from first letter after space
						System.out.print(' ');						// prints space
						System.out.print(sentance.substring(0, wordCount));// prints upto the space
						//	firstWord = sentance;									// sets first word equal to sentance
    		    		//	System.out.println("The first word is :" + firstWord);	// prints the words entered
    		    		//	System.out.print("The word count entered was :"+"\t"+wordCount+"\n");//prints the word count
    		    	}
    		    	
    		  	
   		
    		 
    		}  //end of loop
    	
   		
    
    }
}

