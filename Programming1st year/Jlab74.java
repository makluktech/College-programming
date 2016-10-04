
class Jlab74

// Student Name : 		Colm Carey
// Student Id Number : 	C00197157
// Date :				16/02/2015
// Purpose : 			read alphabetical charaters in array and tell amount of vowels and consanants


{		
       	
   public static void main (String[]args )  
	{  
		char 	myNewArray [];
    	int 	index ;
    	int 	vowelsCounter;
    	int		consCounter;
    	char 	caps;
    	
        myNewArray = new char [5];//set array to 5
        vowelsCounter =0;
    	consCounter =0;
       

    	for (index = 0; index <= 4;index ++)//loop to take in 5 characters
    		{
    			System.out.print("Please enter a character ");
				myNewArray [index] = EasyIn.getChar();
    		}
    	System.out.println();
    	System.out.println("The characters entered in the array are :" );
    	for (index = 0; index <= 4;index ++)
    		{
    			System.out.println(myNewArray [index]);//print the characters entered
    		}
	
		for (index = 0; index < 5; index ++)//loop to count vowels and consanants		 		
			{
		 		caps = Character.toUpperCase(myNewArray [index]) ;//set all to uppercase
			    if(caps == 'A' || caps == 'E' ||  caps == 'I' || caps == 'O' || caps == 'U')
			    	{
			    		vowelsCounter ++ ; //add one each time vowel is found
			    	}
				else
					{
						consCounter ++; // add one each time consanant is found
					}
			}	//end of loop for counting vowels and consanants	
			
     	System.out.println("\nThe number of vowels entered was :" + vowelsCounter);//print the number of vowels found
      	System.out.println("\nThe number of consonants entered was :" + consCounter);//print the number of consanants found
	    	
	    		
    }
   
}
