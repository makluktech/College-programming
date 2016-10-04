class Jlab42  

// Student Name : 		Colm Carey
// Student Id Number : 	COM197157
// Date :				06/10/2014
// Purpose : 			Take in a name a only show first name back to screen

 
{
    public static void main(String[] args)
	{
		String name;
		String firstName;
		int position;
	
		
		System.out.print("Please enter a Name :");
		name = EasyIn.getString();		
		position = name.indexOf(" ");
		firstName = name.substring(0,position );//sets the substring to read from postion 0 to the next space in the string
		System.out.println("the Firstname entered is :"+ firstName);// prints the Firstname entered.

	
	}
}
