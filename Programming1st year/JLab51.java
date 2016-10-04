
class	Jlab51	

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				28/11/2014
// Purpose : 			To get the word count of a string



{
    public static void main(String[] args)
    {					// declare variables used
    	String sentance;
    	String firstWord;
    	int spacePosition; 
    	int wordCount;
    
    	
    	 
    	
    	System.out.print("Please enter your sentance : ");
    	sentance = EasyIn.getString();
        spacePosition = sentance.indexOf(" ");// sets spaceposition to the space in the sentance
    	wordCount=1;
    	
    	
    	
    	while(spacePosition > - 1)			//start the loop 
    	{
    		
    			
    		firstWord = sentance.substring(0,spacePosition);// checkes upto first space in sentance
    		sentance = sentance.substring(spacePosition +1);//sets sentance = to first word
    		System.out.println("The first word is :" + firstWord);
    		spacePosition = sentance.indexOf(" ");
    		wordCount++;								// counts number of words
    		
    			if(spacePosition == -1)						//takes the word before the space
    		   	
    		    	{
    		    		firstWord = sentance;									// sets first word equal to sentance
    		    		System.out.println("The first word is :" + firstWord);	// prints the words entered
    		    		System.out.print("The word count entered was :"+"\t"+wordCount+"\n");//prints the word count
    		    	}
    		  
    		
    		    	
    		  	
   		
    		 
    		}  //end of loop
    		  
    }
}

