


class firstArray

{	
  public static void main(String []args ) 
    {//Make an array that take in numbers and prints back to the user
       int myFirstArray[];
       int index;
       myFirstArray = new int[5];
       
       
       for(index=0;index<=4;index++)//loops through numbers entered
       	{
       		System.out.println("Please enter your numbers");
        	myFirstArray[index]=EasyIn.getInt();
       	}
       
        for(index=0;index<=4;index++)//loop to print back numbers enter
      	 {
       		System.out.println(myFirstArray[index]);//prints the numbers in the array to the screen
       	
       	 }
       
       
       
       
       
       
    }
   
}
