
class	OccuranceOfLetters

// Student Name 	: 	Colm Carey
// Student Id Number : 	CO0197157
// Date :				19/11/2014
// Purpose : 			To take in the name of five people and out put largest name



{
      public static void main(String[] args)
    {
    	String wordArray[];
    	int index;
    	String largestWord;
    	int counter1;
    
    	wordArray = new String[5]; 
    	counter1=0;
    	largestWord="";
    	
    		for(index=0;index < 5;index++)
    		 	{
			       System.out.println("Please enter your word :");//prompt user to enter words
			       wordArray[index] = EasyIn.getString();//take in words entered by user
    			}
    			
    			   System.out.println("=======================");
    			   System.out.println("The words you entered were:");
    		for(index = 0;index <=4; index++)//loop to print back words enter
      	 		{
       				System.out.println(wordArray[index]);//prints the words in the array to the screen
       	 		}
       	 	for (index = 0; index <= 4;index ++)//loop to check for LargestWord
    			{
	    			
		    		if (index == 0)
		    			{//set  largestWord  equal to index position 0
		    				largestWord = wordArray [index];
		    				
		    			}
		    		else if (wordArray [index].length()> largestWord.length())//to check for largest word
		    			{
		    				largestWord = wordArray [index];//replace if the word is bigger
		    			}
				}//end loop for biggest word
			for (index = 0; index < wordArray.length;index++)//loop to find occurance of biggest word
		  		{
		    		if(wordArray [index].length() >= largestWord.length())
		    			{ 
		    				 largestWord = wordArray [index];
		    					counter1++;
		    			}
		   
				}//end loop for occurance of biggest word
		
			
		System.out.println("The largest word in the array was :" + largestWord);// print the biggest word found
		System.out.println();
		System.out.println("The largest word appeared in the array  :" + counter1+" "+"Times");// print occurances of biggest word			
       	 		
       	 		
    }
}

