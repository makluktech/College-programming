/*Author: Colm Carey	Date:29/09/15
 ** prog to input temperature value in Celsius
 **/
public class Ex1q7 
{
	public static void main(String[] args) 
	{
		int temp;
		
	   
		
		System.out.print("please enter a Temperature in Celsius :");
		temp = EasyIn.getInt();
		
		// check if weather is cold warm
		
		System.out.println(" Temperature Range    Message");

		if(temp <= -10 && temp <= +5)
		 {
			System.out.println(" "+ temp + "Very Cold");
		 }
		else if(temp  > 5 && temp <= 15)
		 {
			System.out.println(" "+ temp + " Cold");
		 }
		else if(temp > 15 && temp < 22)
		 {
			System.out.println(""+ temp + "Warm ");
		 }
		
	}
		
}
