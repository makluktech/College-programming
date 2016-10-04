


class Jlab71

{	
 public static boolean evenNum(int newNum)
    {
    	boolean isEven;
    	isEven = true;
    		if(newNum % 2 == 0 ) // does calculation for % of num1
    		{
    			isEven = true;	
    		}
    		
    		else
    		
    		{
    			  isEven=false;
    		}
    		return isEven;
    		
   	}

  public static void main(String []args ) 
    {//Make an array that take in numbers and prints back to the user
       int myFirstArray[];
       int index;
       int numOfEven;
       myFirstArray = new int[5];
       
       numOfEven=0;
       for(index=0;index<=4;index++)//loops through numbers entered
       	{
       		System.out.println("Please enter your numbers to check");
        	myFirstArray[index]=EasyIn.getInt();
       	}
       
        for(index=0;index<=4;index++)//loop to print back numbers enter
      	 {
       		if(evenNum(myFirstArray[index]))
       			{
       				numOfEven++;
       			}
       	
       	 }
       
       	System.out.println("The number of even num is: "+numOfEven);
       
       
       
       
       
    }
   
}
